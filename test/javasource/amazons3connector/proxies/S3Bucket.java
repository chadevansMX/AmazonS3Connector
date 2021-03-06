// This file was generated by Mendix Business Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package amazons3connector.proxies;

import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixIdentifier;
import com.mendix.systemwideinterfaces.core.IMendixObject;

/**
 * Represents the S3 Bucket - No intent to persist
 */
public class S3Bucket
{
	private final IMendixObject s3BucketMendixObject;

	private final IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final String entityName = "AmazonS3Connector.S3Bucket";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Name("Name");

		private String metaName;

		MemberNames(String s)
		{
			metaName = s;
		}

		@Override
		public String toString()
		{
			return metaName;
		}
	}

	public S3Bucket(IContext context)
	{
		this(context, Core.instantiate(context, "AmazonS3Connector.S3Bucket"));
	}

	protected S3Bucket(IContext context, IMendixObject s3BucketMendixObject)
	{
		if (s3BucketMendixObject == null)
			throw new IllegalArgumentException("The given object cannot be null.");
		if (!Core.isSubClassOf("AmazonS3Connector.S3Bucket", s3BucketMendixObject.getType()))
			throw new IllegalArgumentException("The given object is not a AmazonS3Connector.S3Bucket");

		this.s3BucketMendixObject = s3BucketMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'S3Bucket.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static amazons3connector.proxies.S3Bucket initialize(IContext context, IMendixIdentifier mendixIdentifier) throws CoreException
	{
		return amazons3connector.proxies.S3Bucket.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.getSudoContext() can be used to obtain sudo access).
	 */
	public static amazons3connector.proxies.S3Bucket initialize(IContext context, IMendixObject mendixObject)
	{
		return new amazons3connector.proxies.S3Bucket(context, mendixObject);
	}

	public static amazons3connector.proxies.S3Bucket load(IContext context, IMendixIdentifier mendixIdentifier) throws CoreException
	{
		IMendixObject mendixObject = Core.retrieveId(context, mendixIdentifier);
		return amazons3connector.proxies.S3Bucket.initialize(context, mendixObject);
	}

	public static java.util.List<amazons3connector.proxies.S3Bucket> load(IContext context, String xpathConstraint) throws CoreException
	{
		java.util.List<amazons3connector.proxies.S3Bucket> result = new java.util.ArrayList<amazons3connector.proxies.S3Bucket>();
		for (IMendixObject obj : Core.retrieveXPathQuery(context, "//AmazonS3Connector.S3Bucket" + xpathConstraint))
			result.add(amazons3connector.proxies.S3Bucket.initialize(context, obj));
		return result;
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws CoreException
	{
		Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(IContext context) throws CoreException
	{
		Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(IContext context)
	{
		Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of Name
	 */
	public final String getName()
	{
		return getName(getContext());
	}

	/**
	 * @param context
	 * @return value of Name
	 */
	public final String getName(IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.Name.toString());
	}

	/**
	 * Set value of Name
	 * @param name
	 */
	public final void setName(String name)
	{
		setName(getContext(), name);
	}

	/**
	 * Set value of Name
	 * @param context
	 * @param name
	 */
	public final void setName(IContext context, String name)
	{
		getMendixObject().setValue(context, MemberNames.Name.toString(), name);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final IMendixObject getMendixObject()
	{
		return s3BucketMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final IContext getContext()
	{
		return context;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final amazons3connector.proxies.S3Bucket that = (amazons3connector.proxies.S3Bucket) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static String getType()
	{
		return "AmazonS3Connector.S3Bucket";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@Deprecated
	public String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
