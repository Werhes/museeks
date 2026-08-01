package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْٞٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC13402e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC13402e[] f26659e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final EnumC13402e f26660e;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC13402e EF0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, eْٞٔ] */
    static {
        Enum r0 = new Enum("AM", 0);
        ?? r1 = new Enum("PM", 1);
        f26660e = r1;
        f26659e = new EnumC13402e[]{r0, r1};
    }

    public static EnumC13402e valueOf(String str) {
        return (EnumC13402e) Enum.valueOf(EnumC13402e.class, str);
    }

    public static EnumC13402e[] values() {
        return (EnumC13402e[]) f26659e.clone();
    }
}
