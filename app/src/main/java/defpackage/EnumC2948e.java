package defpackage;

import java.util.HashMap;
import java.util.Locale;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۣؔؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC2948e {
    OGG("ogg"),
    MP3("mp3"),
    FLAC("flac"),
    MP4("mp4"),
    M4A("m4a"),
    M4P("m4p"),
    WMA("wma"),
    WAV("wav"),
    RA("ra"),
    RM("rm"),
    M4B("m4b"),
    AIF("aif"),
    AIFF("aiff"),
    AIFC("aifc"),
    DSF("dsf"),
    UNKNOWN(BuildConfig.FLAVOR);


    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public static final HashMap f6946e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final String f6958e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [eۣؔؐ, eؕۜۖ] */
    /* JADX WARN: Type inference failed for: r0v3, types: [eٌؓ٘, eۣؔؐ] */
    /* JADX WARN: Type inference failed for: r10v2, types: [eۣؔؐ, eؙُٔ] */
    /* JADX WARN: Type inference failed for: r11v3, types: [eًٟٛ, eۣؔؐ] */
    /* JADX WARN: Type inference failed for: r12v2, types: [eٔۖۘ, eۣؔؐ] */
    /* JADX WARN: Type inference failed for: r13v3, types: [eۣؔؐ, eّْؑ] */
    /* JADX WARN: Type inference failed for: r14v8, types: [eؚٕٖ, eۣؔؐ] */
    /* JADX WARN: Type inference failed for: r1v1, types: [eۣؔؐ, eّؔۗ] */
    /* JADX WARN: Type inference failed for: r2v2, types: [eؙٕؖ, eۣؔؐ] */
    /* JADX WARN: Type inference failed for: r3v2, types: [eۣؔؐ, eٌٓ٘] */
    /* JADX WARN: Type inference failed for: r4v2, types: [eۣؔؐ, eؗۙؐ] */
    /* JADX WARN: Type inference failed for: r5v3, types: [eُِٛ, eۣؔؐ] */
    /* JADX WARN: Type inference failed for: r6v2, types: [eٍۢۜ, eۣؔؐ] */
    /* JADX WARN: Type inference failed for: r7v3, types: [eۣؔؐ, eٕۧؐ] */
    /* JADX WARN: Type inference failed for: r8v2, types: [eۣؔؐ, eُۘۚ] */
    /* JADX WARN: Type inference failed for: r9v3, types: [eٌۘؓ, eۣؔؐ] */
    static {
        EnumC2948e[] values = values();
        f6946e = new HashMap(values.length);
        for (EnumC2948e enumC2948e : values) {
            f6946e.put(enumC2948e.f6958e, enumC2948e);
        }
    }

    EnumC2948e(String str) {
        this.f6958e = str.toLowerCase(Locale.ROOT);
    }

    public abstract InterfaceC9354e ad();
}
