package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِؗؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4810e {
    public int ad;
    public long appmetrica;
    public long billing;
    public float license;
    public float metrica;
    public long purchase;
    public int startapp;
    public int vip;
    public float yandex;

    public final float ad(long j) {
        long j2 = this.appmetrica;
        if (j < j2) {
            return 0.0f;
        }
        long j3 = this.billing;
        if (j3 < 0 || j < j3) {
            return ViewOnTouchListenerC8658e.vip(((float) (j - j2)) / this.ad, 0.0f, 1.0f) * 0.5f;
        }
        float f = this.yandex;
        return (ViewOnTouchListenerC8658e.vip(((float) (j - j3)) / this.startapp, 0.0f, 1.0f) * f) + (1.0f - f);
    }
}
