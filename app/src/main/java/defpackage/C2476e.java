package defpackage;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؔۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2476e extends AbstractC0241e {

    /* renamed from: eؙؕ, reason: contains not printable characters */
    public C14909e f6321e;

    /* renamed from: eَٕٞ, reason: contains not printable characters */
    public long f6322e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public final C7507e f6323e;

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public final C1292e f6324e;

    public C2476e() {
        super(6);
        this.f6323e = new C7507e(1);
        this.f6324e = new C1292e();
    }

    @Override // defpackage.AbstractC0241e, defpackage.InterfaceC0396e
    public final void ad(int i, Object obj) {
        if (i == 8) {
            this.f6321e = (C14909e) obj;
        }
    }

    @Override // defpackage.AbstractC0241e
    public final void adcel() {
        C14909e c14909e = this.f6321e;
        if (c14909e != null) {
            c14909e.license();
        }
    }

    @Override // defpackage.AbstractC0241e
    public final void advert(long j, boolean z, boolean z2) {
        this.f6322e = Long.MIN_VALUE;
        C14909e c14909e = this.f6321e;
        if (c14909e != null) {
            c14909e.license();
        }
    }

    @Override // defpackage.AbstractC0241e
    public final int premium(C16975e c16975e) {
        return "application/x-camera-motion".equals(c16975e.loadAd) ? AbstractC0054e.tapsense(4, 0, 0, 0) : AbstractC0054e.tapsense(0, 0, 0, 0);
    }

    @Override // defpackage.AbstractC0241e
    public final String purchase() {
        return "CameraMotionRenderer";
    }

    @Override // defpackage.AbstractC0241e
    public final void signatures(long j, long j2) {
        float[] fArr;
        while (!billing() && this.f6322e < 100000 + j) {
            C7507e c7507e = this.f6323e;
            c7507e.amazon();
            C13391e c13391e = this.f1492e;
            c13391e.advert();
            if (pro(c13391e, c7507e, 0) != -4 || c7507e.metrica(4)) {
                return;
            }
            long j3 = c7507e.f15301e;
            this.f6322e = j3;
            boolean z = j3 < this.f1491e;
            if (this.f6321e != null && !z) {
                c7507e.subscription();
                ByteBuffer byteBuffer = c7507e.f15296e;
                String str = AbstractC9413e.ad;
                if (byteBuffer.remaining() != 16) {
                    fArr = null;
                } else {
                    byte[] array = byteBuffer.array();
                    int limit = byteBuffer.limit();
                    C1292e c1292e = this.f6324e;
                    c1292e.m570throw(limit, array);
                    c1292e.m571try(byteBuffer.arrayOffset() + 4);
                    float[] fArr2 = new float[3];
                    for (int i = 0; i < 3; i++) {
                        fArr2[i] = Float.intBitsToFloat(c1292e.loadAd());
                    }
                    fArr = fArr2;
                }
                if (fArr != null) {
                    this.f6321e.metrica(this.f6322e - this.f1501e, fArr);
                }
            }
        }
    }

    @Override // defpackage.AbstractC0241e
    public final boolean startapp() {
        return true;
    }
}
