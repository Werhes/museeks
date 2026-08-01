package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗۘۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC5115e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final /* synthetic */ C15937e f10978e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC5115e[] f10979e;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        EnumC5115e[] enumC5115eArr = {new Enum("PLAY", 0), new Enum("PAUSE", 1), new Enum("PREVIOUS", 2), new Enum("NEXT", 3), new Enum("TOGGLE_REPEAT", 4), new Enum("TOGGLE_SHUFFLE", 5)};
        f10979e = enumC5115eArr;
        f10978e = new C15937e(enumC5115eArr);
    }

    public static EnumC5115e valueOf(String str) {
        return (EnumC5115e) Enum.valueOf(EnumC5115e.class, str);
    }

    public static EnumC5115e[] values() {
        return (EnumC5115e[]) f10979e.clone();
    }
}
