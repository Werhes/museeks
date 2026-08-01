package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖۚۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC16488e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC16488e[] f32312e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final EnumC16488e f32313e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final EnumC16488e f32314e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final EnumC16488e f32315e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final EnumC16488e f32316e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, eٖۚۡ] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, eٖۚۡ] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, eٖۚۡ] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, eٖۚۡ] */
    static {
        ?? r0 = new Enum("Active", 0);
        f32316e = r0;
        ?? r1 = new Enum("ActiveParent", 1);
        f32314e = r1;
        ?? r3 = new Enum("Captured", 2);
        f32313e = r3;
        ?? r5 = new Enum("Inactive", 3);
        f32315e = r5;
        f32312e = new EnumC16488e[]{r0, r1, r3, r5};
    }

    public static EnumC16488e valueOf(String str) {
        return (EnumC16488e) Enum.valueOf(EnumC16488e.class, str);
    }

    public static EnumC16488e[] values() {
        return (EnumC16488e[]) f32312e.clone();
    }

    public final boolean ad() {
        int ordinal = ordinal();
        if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
            return true;
        }
        if (ordinal == 3) {
            return false;
        }
        throw new C14803e(10);
    }

    public final boolean vip() {
        int ordinal = ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return false;
            }
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return false;
                }
                throw new C14803e(10);
            }
        }
        return true;
    }
}
