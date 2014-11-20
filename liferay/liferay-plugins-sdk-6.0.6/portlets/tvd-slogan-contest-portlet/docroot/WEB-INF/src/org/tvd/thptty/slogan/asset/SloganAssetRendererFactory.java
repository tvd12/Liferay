package org.tvd.thptty.slogan.asset;

import org.tvd.thptty.slogan.model.Slogan;
import org.tvd.thptty.slogan.service.SloganLocalServiceUtil;
import org.tvd.thptty.slogan.asset.SloganAssetRenderer;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portlet.asset.model.AssetRenderer;
import com.liferay.portlet.asset.model.BaseAssetRendererFactory;

public class SloganAssetRendererFactory extends BaseAssetRendererFactory {

    public static final String CLASS_NAME = Slogan.class.getName();

    public static final String TYPE = "slogan";

    public AssetRenderer getAssetRenderer(long classPK, int type)
        throws PortalException, SystemException {

        Slogan slogan = SloganLocalServiceUtil.getSlogan(classPK);

        return new SloganAssetRenderer(slogan);
    }

    public String getClassName() {
        return CLASS_NAME;
    }

    public String getType() {
        return TYPE;
    }

}
