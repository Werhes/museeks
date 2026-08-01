package ealvatag.tag.id3.framebody;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* loaded from: classes3.dex */
public class FrameBodyDeprecated extends AbstractID3v2FrameBody implements ID3v24FrameBody, ID3v23FrameBody {
    private AbstractID3v2FrameBody originalFrameBody;

    public FrameBodyDeprecated(AbstractID3v2FrameBody abstractID3v2FrameBody) {
        this.originalFrameBody = abstractID3v2FrameBody;
    }

    public FrameBodyDeprecated(FrameBodyDeprecated frameBodyDeprecated) {
        super(frameBodyDeprecated);
    }

    @Override // ealvatag.tag.id3.framebody.AbstractID3v2FrameBody, defpackage.AbstractC12444e
    public boolean equals(Object obj) {
        return (obj instanceof FrameBodyDeprecated) && getIdentifier().equals(((FrameBodyDeprecated) obj).getIdentifier()) && super.equals(obj);
    }

    @Override // defpackage.AbstractC12444e
    public String getBriefDescription() {
        AbstractID3v2FrameBody abstractID3v2FrameBody = this.originalFrameBody;
        return abstractID3v2FrameBody != null ? abstractID3v2FrameBody.getBriefDescription() : BuildConfig.FLAVOR;
    }

    @Override // ealvatag.tag.id3.framebody.AbstractID3v2FrameBody
    public String getIdentifier() {
        return this.originalFrameBody.getIdentifier();
    }

    public AbstractID3v2FrameBody getOriginalFrameBody() {
        return this.originalFrameBody;
    }

    @Override // ealvatag.tag.id3.framebody.AbstractID3v2FrameBody, defpackage.AbstractC11463e
    public int getSize() {
        return this.originalFrameBody.getSize();
    }

    @Override // defpackage.AbstractC12444e
    public void setupObjectList() {
    }

    @Override // defpackage.AbstractC12444e
    public String toString() {
        return getIdentifier();
    }
}
