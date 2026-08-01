package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eٓۧٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC14399e {
    public static final C0416e Companion;

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final EnumC14399e f28477e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final EnumC14399e f28478e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final EnumC14399e f28479e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC14399e[] f28480e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final EnumC14399e f28481e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final Object f28482e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final EnumC14399e f28483e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final EnumC14399e f28484e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [eٓۧٝ, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, eؑٛۧ] */
    /* JADX WARN: Type inference failed for: r11v1, types: [eٓۧٝ, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [eٓۧٝ, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v1, types: [eٓۧٝ, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r7v1, types: [eٓۧٝ, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r9v1, types: [eٓۧٝ, java.lang.Enum] */
    static {
        ?? r0 = new Enum("BaseScreen", 0);
        f28479e = r0;
        ?? r1 = new Enum("WelcomeScreen", 1);
        f28478e = r1;
        ?? r3 = new Enum("NumberScreen", 2);
        f28481e = r3;
        Enum r5 = new Enum("TopScreen", 3);
        ?? r7 = new Enum("SummaryScreen", 4);
        f28477e = r7;
        ?? r9 = new Enum("BaseExtScreen", 5);
        f28484e = r9;
        ?? r11 = new Enum("AchievementScreen", 6);
        f28483e = r11;
        f28480e = new EnumC14399e[]{r0, r1, r3, r5, r7, r9, r11, new Enum("BaseExtScreenPlaylist", 7), new Enum("PlaceholderScreen", 8), new Enum("VideoScreen", 9), new Enum("TopArtistScreen", 10)};
        Companion = new Object();
        f28482e = AbstractC18039e.appmetrica(2, new C18420e(9));
    }

    public static EnumC14399e valueOf(String str) {
        return (EnumC14399e) Enum.valueOf(EnumC14399e.class, str);
    }

    public static EnumC14399e[] values() {
        return (EnumC14399e[]) f28480e.clone();
    }
}
