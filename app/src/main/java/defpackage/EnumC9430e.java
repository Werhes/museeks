package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍّٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC9430e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC9430e[] f18767e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final EnumC9430e f18768e;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC9430e EF0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, eٍّٙ] */
    static {
        Enum r0 = new Enum("Classic", 0);
        ?? r1 = new Enum("Absolution", 1);
        f18768e = r1;
        f18767e = new EnumC9430e[]{r0, r1};
    }

    public static EnumC9430e valueOf(String str) {
        return (EnumC9430e) Enum.valueOf(EnumC9430e.class, str);
    }

    public static EnumC9430e[] values() {
        return (EnumC9430e[]) f18767e.clone();
    }
}
