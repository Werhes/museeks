package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘْٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5616e {
    public static final C13789e ad = new C13789e(0.4f, 0.0f, 0.2f, 1.0f);
    public static final C13789e vip = new C13789e(0.0f, 0.0f, 0.2f, 1.0f);
    public static final C13789e metrica = new C13789e(0.4f, 0.0f, 1.0f, 1.0f);
    public static final C15239e license = new InterfaceC17838e() { // from class: eّٕؖ
        public final /* synthetic */ int ad = 1;

        @Override // defpackage.InterfaceC17838e
        public final float ad(float f) {
            float f2;
            float f3;
            switch (this.ad) {
                case 0:
                    if (f < 0.36363637f) {
                        return 7.5625f * f * f;
                    }
                    if (f < 0.72727275f) {
                        float f4 = f - 0.54545456f;
                        f2 = 7.5625f * f4 * f4;
                        f3 = 0.75f;
                    } else if (f < 0.90909094f) {
                        float f5 = f - 0.8181818f;
                        f2 = 7.5625f * f5 * f5;
                        f3 = 0.9375f;
                    } else {
                        float f6 = f - 0.95454544f;
                        f2 = 7.5625f * f6 * f6;
                        f3 = 0.984375f;
                    }
                    return f2 + f3;
                default:
                    return f;
            }
        }
    };
}
