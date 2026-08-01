package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٔۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14937e {
    public int ad;
    public Object license;
    public boolean metrica;
    public boolean vip;

    public C14937e(C13879e c13879e, int i, boolean z, boolean z2) {
        this.license = c13879e;
        this.ad = i;
        this.vip = z;
        this.metrica = z2;
    }

    public void ad(String str) {
        ((C13879e) this.license).m3696e(this.ad, this.vip, this.metrica, str, null, null, null);
    }

    public void license(String str, Object obj, Object obj2, Object obj3) {
        ((C13879e) this.license).m3696e(this.ad, this.vip, this.metrica, str, obj, obj2, obj3);
    }

    public void metrica(Object obj, Object obj2, String str) {
        ((C13879e) this.license).m3696e(this.ad, this.vip, this.metrica, str, obj, obj2, null);
    }

    public void vip(Object obj, String str) {
        ((C13879e) this.license).m3696e(this.ad, this.vip, this.metrica, str, obj, null, null);
    }
}
