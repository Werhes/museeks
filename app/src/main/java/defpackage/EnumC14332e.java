package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF45' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:343)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۣٓؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC14332e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final EnumC14332e f28352e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final EnumC14332e f28353e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC14332e[] f28354e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final long f28355e;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC14332e EF45;

    static {
        EnumC14332e enumC14332e = new EnumC14332e(TimeUnit.MINUTES.toSeconds(1L), 0, "MINUTE");
        f28353e = enumC14332e;
        EnumC14332e enumC14332e2 = new EnumC14332e(TimeUnit.HOURS.toSeconds(1L), 1, "HOUR");
        f28352e = enumC14332e2;
        long seconds = TimeUnit.DAYS.toSeconds(1L);
        f28354e = new EnumC14332e[]{enumC14332e, enumC14332e2, new EnumC14332e(seconds, 2, "DAY"), new EnumC14332e(7 * seconds, 3, "WEEK"), new EnumC14332e(30 * seconds, 4, "MONTH"), new EnumC14332e(seconds * 365, 5, "YEAR")};
    }

    public EnumC14332e(long j, int i, String str) {
        this.f28355e = j;
    }

    public static EnumC14332e valueOf(String str) {
        return (EnumC14332e) Enum.valueOf(EnumC14332e.class, str);
    }

    public static EnumC14332e[] values() {
        return (EnumC14332e[]) f28354e.clone();
    }
}
