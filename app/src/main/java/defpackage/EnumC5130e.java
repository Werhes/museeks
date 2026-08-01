package defpackage;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 eؗۙۚ, still in use, count: 1, list:
  (r0v0 eؗۙۚ) from 0x00b1: INVOKE (r0v1 java.util.EnumSet) = 
  (r0v0 eؗۙۚ)
  (wrap:eؗۙۚ[]:0x00a3: FILLED_NEW_ARRAY (r1v1 eؗۙۚ), (r2v2 eؗۙۚ), (r4v2 eؗۙۚ), (r6v2 eؗۙۚ), (r8v2 eؗۙۚ), (r10v2 eؗۙۚ) A[WRAPPED] elemType: eؗۙۚ)
 STATIC call: java.util.EnumSet.of(java.lang.Enum, java.lang.Enum[]):java.util.EnumSet A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>, E extends java.lang.Enum<E>[]):java.util.EnumSet<E extends java.lang.Enum<E>> VARARG (c), VARARG_CALL]
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:88)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:87)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:238)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:180)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗۙۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC5130e {
    /* JADX INFO: Fake field, exist only in values array */
    NOTE_A("A"),
    /* JADX INFO: Fake field, exist only in values array */
    NOTE_B("B"),
    /* JADX INFO: Fake field, exist only in values array */
    NOTE_C("C"),
    /* JADX INFO: Fake field, exist only in values array */
    NOTE_D("D"),
    /* JADX INFO: Fake field, exist only in values array */
    NOTE_E("E"),
    /* JADX INFO: Fake field, exist only in values array */
    NOTE_F("F"),
    /* JADX INFO: Fake field, exist only in values array */
    NOTE_G("G"),
    FLAT("b"),
    SHARP("#"),
    MINOR("m"),
    /* JADX INFO: Fake field, exist only in values array */
    OFF_KEY("o");


    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final HashMap f10996e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final HashMap f11001e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final String f11002e;

    static {
        EnumSet of = EnumSet.of(r0, r1, r2, r4, r6, r8, r10);
        f10996e = new HashMap(values().length);
        Iterator it = of.iterator();
        while (it.hasNext()) {
            EnumC5130e enumC5130e = (EnumC5130e) it.next();
            f10996e.put(enumC5130e.f11002e, enumC5130e);
        }
        EnumSet of2 = EnumSet.of(FLAT, SHARP, MINOR);
        f11001e = new HashMap(values().length);
        Iterator it2 = of2.iterator();
        while (it2.hasNext()) {
            EnumC5130e enumC5130e2 = (EnumC5130e) it2.next();
            f11001e.put(enumC5130e2.f11002e, enumC5130e2);
        }
    }

    public EnumC5130e(String str) {
        this.f11002e = str;
    }

    public static EnumC5130e valueOf(String str) {
        return (EnumC5130e) Enum.valueOf(EnumC5130e.class, str);
    }

    public static EnumC5130e[] values() {
        return (EnumC5130e[]) f11000e.clone();
    }
}
