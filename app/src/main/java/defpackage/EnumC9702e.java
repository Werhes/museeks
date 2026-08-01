package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍْۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC9702e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC9702e[] f19199e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final EnumC9702e f19200e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final /* synthetic */ C15937e f19201e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final EnumC9702e f19202e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, eٍْۘ] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, eٍْۘ] */
    static {
        ?? r0 = new Enum("Internal", 0);
        f19202e = r0;
        ?? r1 = new Enum("External", 1);
        f19200e = r1;
        EnumC9702e[] enumC9702eArr = {r0, r1};
        f19199e = enumC9702eArr;
        f19201e = new C15937e(enumC9702eArr);
    }

    public static EnumC9702e valueOf(String str) {
        return (EnumC9702e) Enum.valueOf(EnumC9702e.class, str);
    }

    public static EnumC9702e[] values() {
        return (EnumC9702e[]) f19199e.clone();
    }
}
