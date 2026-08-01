package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُؙۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC10854e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC10854e[] f21498e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final EnumC10854e f21499e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final EnumC10854e f21500e;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC10854e EF0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [eُؙۖ, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v1, types: [eُؙۖ, java.lang.Enum] */
    static {
        Enum r0 = new Enum("DESTROYED", 0);
        ?? r1 = new Enum("CREATED", 1);
        f21500e = r1;
        Enum r3 = new Enum("STARTED", 2);
        ?? r5 = new Enum("RESUMED", 3);
        f21499e = r5;
        f21498e = new EnumC10854e[]{r0, r1, r3, r5};
    }

    public static EnumC10854e valueOf(String str) {
        return (EnumC10854e) Enum.valueOf(EnumC10854e.class, str);
    }

    public static EnumC10854e[] values() {
        return (EnumC10854e[]) f21498e.clone();
    }
}
