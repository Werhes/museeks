package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَ٘ؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC17662e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final EnumC17662e f34615e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final EnumC17662e f34616e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC17662e[] f34617e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final EnumC17662e f34618e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, eَ٘ؓ] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, eَ٘ؓ] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, eَ٘ؓ] */
    static {
        ?? r0 = new Enum("NETWORK_UNMETERED", 0);
        f34618e = r0;
        ?? r1 = new Enum("DEVICE_IDLE", 1);
        f34616e = r1;
        ?? r3 = new Enum("DEVICE_CHARGING", 2);
        f34615e = r3;
        f34617e = new EnumC17662e[]{r0, r1, r3};
    }

    public static EnumC17662e valueOf(String str) {
        return (EnumC17662e) Enum.valueOf(EnumC17662e.class, str);
    }

    public static EnumC17662e[] values() {
        return (EnumC17662e[]) f34617e.clone();
    }
}
