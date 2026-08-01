package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚ٘ۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17618e extends AbstractC1038e {
    public final byte[] license;

    public C17618e(String str) {
        super(3, str);
        this.license = str.getBytes(AbstractC5508e.ad);
    }

    @Override // defpackage.AbstractC1038e
    public final int ad() {
        return this.license.length;
    }

    @Override // defpackage.AbstractC1038e
    public final void vip(C2025e c2025e) {
        for (byte b : this.license) {
            c2025e.yandex(b, 8);
        }
    }
}
