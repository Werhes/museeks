package ealvatag.tag.id3.framebody;

import defpackage.AbstractC18186e;
import defpackage.AbstractC4639e;
import defpackage.AbstractC5542e;
import defpackage.C16151e;
import defpackage.C1724e;
import defpackage.C7936e;
import defpackage.EnumC1005e;
import defpackage.InterfaceC4279e;
import ealvatag.tag.datatype.DataTypes;
import ealvatag.tag.datatype.StringSizeTerminated;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.ByteBuffer;
import java.nio.charset.CharsetEncoder;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* loaded from: classes3.dex */
public abstract class AbstractFrameBodyUrlLink extends AbstractID3v2FrameBody {
    private static final InterfaceC4279e LOG;

    static {
        int i = AbstractC18186e.ad;
        int i2 = C1724e.ad;
        LOG = new C7936e(2);
    }

    public AbstractFrameBodyUrlLink() {
    }

    public AbstractFrameBodyUrlLink(AbstractFrameBodyUrlLink abstractFrameBodyUrlLink) {
        super(abstractFrameBodyUrlLink);
    }

    public AbstractFrameBodyUrlLink(C16151e c16151e, int i) {
        super(c16151e, i);
    }

    public AbstractFrameBodyUrlLink(String str) {
        setObjectValue(DataTypes.OBJ_URLLINK, str);
    }

    public AbstractFrameBodyUrlLink(ByteBuffer byteBuffer, int i) {
        super(byteBuffer, i);
    }

    private String encodeURL(String str) {
        try {
            String[] split = str.split("(?<!/)/(?!/)", -1);
            StringBuilder sb = new StringBuilder(split[0]);
            for (int i = 1; i < split.length; i++) {
                sb.append("/");
                sb.append(URLEncoder.encode(split[i], "utf-8"));
            }
            return sb.toString();
        } catch (UnsupportedEncodingException unused) {
            InterfaceC4279e interfaceC4279e = LOG;
            EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
            ((C7936e) interfaceC4279e).getClass();
            int i2 = C1724e.ad;
            return str;
        }
    }

    public String getUrlLink() {
        return (String) getObjectValue(DataTypes.OBJ_URLLINK);
    }

    @Override // defpackage.AbstractC12444e
    public String getUserFriendlyValue() {
        return getUrlLink();
    }

    public void setUrlLink(String str) {
        AbstractC5542e.metrica(str);
        setObjectValue(DataTypes.OBJ_URLLINK, str);
    }

    @Override // defpackage.AbstractC12444e
    public void setupObjectList() {
        addDataType(new StringSizeTerminated(DataTypes.OBJ_URLLINK, this));
    }

    @Override // ealvatag.tag.id3.framebody.AbstractID3v2FrameBody
    public void write(ByteArrayOutputStream byteArrayOutputStream) {
        CharsetEncoder newEncoder = AbstractC4639e.vip.newEncoder();
        String urlLink = getUrlLink();
        if (!newEncoder.canEncode(urlLink)) {
            setUrlLink(encodeURL(urlLink));
            if (newEncoder.canEncode(getUrlLink())) {
                InterfaceC4279e interfaceC4279e = LOG;
                EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
                getUrlLink();
                ((C7936e) interfaceC4279e).getClass();
                int i = C1724e.ad;
            } else {
                InterfaceC4279e interfaceC4279e2 = LOG;
                EnumC1005e[] enumC1005eArr2 = EnumC1005e.f3456e;
                ((C7936e) interfaceC4279e2).getClass();
                int i2 = C1724e.ad;
                setUrlLink(BuildConfig.FLAVOR);
            }
        }
        super.write(byteArrayOutputStream);
    }
}
