package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖؒۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class EnumC1093e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC1093e[] f3632e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final C13470e f3633e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final C7115e f3634e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final C12272e f3635e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final C2974e f3636e;

    static {
        C2974e c2974e = new C2974e();
        f3636e = c2974e;
        C7115e c7115e = new C7115e();
        f3634e = c7115e;
        C13470e c13470e = new C13470e();
        f3633e = c13470e;
        C12272e c12272e = new C12272e();
        f3635e = c12272e;
        f3632e = new EnumC1093e[]{c2974e, c7115e, c13470e, c12272e};
    }

    public static EnumC1093e valueOf(String str) {
        return (EnumC1093e) Enum.valueOf(EnumC1093e.class, str);
    }

    public static EnumC1093e[] values() {
        return (EnumC1093e[]) f3632e.clone();
    }

    public static EnumC1093e vip(AbstractC15728e abstractC15728e) {
        if (abstractC15728e.Signature()) {
            return f3634e;
        }
        if (abstractC15728e instanceof C12519e) {
        }
        return AbstractC18292e.metrica(C4590e.f9890e.m1643transient(), AbstractC9600e.metrica(abstractC15728e), C11803e.startapp) ? f3635e : f3633e;
    }

    public abstract EnumC1093e ad(AbstractC15728e abstractC15728e);
}
