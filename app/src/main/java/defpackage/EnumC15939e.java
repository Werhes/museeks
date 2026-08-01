package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖؒۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC15939e {
    private static final /* synthetic */ InterfaceC5072e $ENTRIES;
    private static final /* synthetic */ EnumC15939e[] $VALUES;

    @InterfaceC7685e(name = "audiobooks")
    public static final EnumC15939e AUDIOBOOKS;

    @InterfaceC7685e(name = "podcasts")
    public static final EnumC15939e PODCASTS;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, eٖؒۤ] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, eٖؒۤ] */
    static {
        ?? r0 = new Enum("PODCASTS", 0);
        PODCASTS = r0;
        ?? r1 = new Enum("AUDIOBOOKS", 1);
        AUDIOBOOKS = r1;
        EnumC15939e[] enumC15939eArr = {r0, r1};
        $VALUES = enumC15939eArr;
        $ENTRIES = new C15937e(enumC15939eArr);
    }

    public static EnumC15939e valueOf(String str) {
        return (EnumC15939e) Enum.valueOf(EnumC15939e.class, str);
    }

    public static EnumC15939e[] values() {
        return (EnumC15939e[]) $VALUES.clone();
    }
}
