package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًَؚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC7842e implements InterfaceC1823e {
    UNKNOWN_FORMAT(0),
    NV16(1),
    NV21(2),
    YV12(3),
    YUV_420_888(7),
    /* JADX INFO: Fake field, exist only in values array */
    JPEG(8),
    BITMAP(4),
    /* JADX INFO: Fake field, exist only in values array */
    CM_SAMPLE_BUFFER_REF(5),
    /* JADX INFO: Fake field, exist only in values array */
    UI_IMAGE(6),
    /* JADX INFO: Fake field, exist only in values array */
    CV_PIXEL_BUFFER_REF(9);


    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int f15890e;

    EnumC7842e(int i) {
        this.f15890e = i;
    }

    @Override // defpackage.InterfaceC1823e
    public final int ad() {
        return this.f15890e;
    }
}
