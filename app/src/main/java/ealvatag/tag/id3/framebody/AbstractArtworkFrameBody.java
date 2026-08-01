package ealvatag.tag.id3.framebody;

import defpackage.AbstractC4639e;
import defpackage.C16151e;
import ealvatag.tag.datatype.DataTypes;
import java.nio.ByteBuffer;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* loaded from: classes3.dex */
public abstract class AbstractArtworkFrameBody extends AbstractID3v2FrameBody {
    public AbstractArtworkFrameBody() {
    }

    public AbstractArtworkFrameBody(AbstractID3v2FrameBody abstractID3v2FrameBody) {
        super(abstractID3v2FrameBody);
    }

    public AbstractArtworkFrameBody(C16151e c16151e, int i) {
        super(c16151e, i);
    }

    public AbstractArtworkFrameBody(ByteBuffer byteBuffer, int i) {
        super(byteBuffer, i);
    }

    public abstract byte[] getImageData();

    public String getImageUrl() {
        return isImageUrl() ? new String((byte[]) getObjectValue(DataTypes.OBJ_PICTURE_DATA), 0, ((byte[]) getObjectValue(DataTypes.OBJ_PICTURE_DATA)).length, AbstractC4639e.vip) : BuildConfig.FLAVOR;
    }

    public abstract String getMimeType();

    public int getPictureType() {
        return ((Long) getObjectValue(DataTypes.OBJ_PICTURE_TYPE)).intValue();
    }

    public abstract boolean isImageUrl();
}
