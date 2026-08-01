package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌَٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class EnumC10158e implements InterfaceC11801e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC10158e[] f20097e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final C5445e f20098e;

    static {
        C5445e c5445e = new C5445e();
        f20098e = c5445e;
        f20097e = new EnumC10158e[]{c5445e, new EnumC10158e() { // from class: eؘّۘ
            @Override // defpackage.InterfaceC11801e
            public final boolean apply(Object obj) {
                return false;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "Predicates.alwaysFalse()";
            }
        }, new EnumC10158e() { // from class: eِّۗ
            @Override // defpackage.InterfaceC11801e
            public final boolean apply(Object obj) {
                return obj == null;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "Predicates.isNull()";
            }
        }, new EnumC10158e() { // from class: eؚؓۙ
            @Override // defpackage.InterfaceC11801e
            public final boolean apply(Object obj) {
                return obj != null;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "Predicates.notNull()";
            }
        }};
    }

    public static EnumC10158e valueOf(String str) {
        return (EnumC10158e) Enum.valueOf(EnumC10158e.class, str);
    }

    public static EnumC10158e[] values() {
        return (EnumC10158e[]) f20097e.clone();
    }
}
