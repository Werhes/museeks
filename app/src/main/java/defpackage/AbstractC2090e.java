package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓۛٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2090e {
    public static final C16005e metrica;
    public static final float ad = AbstractC18359e.ad;
    public static final float vip = AbstractC5202e.ad;

    static {
        int i = AbstractC13243e.ad;
        C0576e c0576e = AbstractC8882e.ad;
        ((Boolean) c0576e.getValue()).booleanValue();
        float f = 12;
        AbstractC12220e.vip(f, 2);
        AbstractC12220e.appmetrica(f, 0.0f, 4, 0.0f, 10);
        if (((Boolean) c0576e.getValue()).booleanValue()) {
            AbstractC12220e.appmetrica(0, 0.0f, 6, 0.0f, 10);
        } else {
            AbstractC12220e.ad(0);
        }
        float f2 = AbstractC5711e.metrica;
        float f3 = 0;
        metrica = new C16005e(f2, f3, f2, f3);
        if (((Boolean) c0576e.getValue()).booleanValue()) {
            AbstractC12220e.license(16, f, 10, f);
        } else {
            AbstractC12220e.vip(f2, f);
        }
        AbstractC12220e.vip(f3, AbstractC5711e.license);
    }
}
