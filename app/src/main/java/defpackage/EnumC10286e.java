package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٕۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC10286e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final EnumC10286e f20304e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final EnumC10286e f20305e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC10286e[] f20306e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final EnumC10286e f20307e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, eَٕۧ] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, eَٕۧ] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, eَٕۧ] */
    static {
        ?? r0 = new Enum("DISABLED", 0);
        f20307e = r0;
        ?? r1 = new Enum("PLAYLIST", 1);
        f20305e = r1;
        ?? r3 = new Enum("ONCE", 2);
        f20304e = r3;
        f20306e = new EnumC10286e[]{r0, r1, r3};
    }

    public static EnumC10286e valueOf(String str) {
        return (EnumC10286e) Enum.valueOf(EnumC10286e.class, str);
    }

    public static EnumC10286e[] values() {
        return (EnumC10286e[]) f20306e.clone();
    }
}
