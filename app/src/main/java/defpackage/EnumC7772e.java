package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؘۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC7772e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC7772e[] f15754e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final EnumC7772e f15755e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final EnumC7772e f15756e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, eًؘۥ] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, eًؘۥ] */
    static {
        ?? r0 = new Enum("OPEN", 0);
        f15756e = r0;
        ?? r1 = new Enum("CLOSED", 1);
        f15755e = r1;
        f15754e = new EnumC7772e[]{r0, r1};
    }

    public static EnumC7772e valueOf(String str) {
        return (EnumC7772e) Enum.valueOf(EnumC7772e.class, str);
    }

    public static EnumC7772e[] values() {
        return (EnumC7772e[]) f15754e.clone();
    }
}
