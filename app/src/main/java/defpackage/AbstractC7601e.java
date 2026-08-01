package defpackage;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚۦَ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC7601e extends AbstractC0798e {

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public static final AbstractC7255e f15445e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public static final C8209e f15446e = new C8209e(AbstractC7601e.class);

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public volatile Set f15447e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public volatile int f15448e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [eؚٚؓ] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    static {
        Throwable th;
        ?? r0;
        try {
            th = null;
            r0 = new C15011e(AtomicReferenceFieldUpdater.newUpdater(AbstractC7601e.class, Set.class, "eٌٍٚ"), AtomicIntegerFieldUpdater.newUpdater(AbstractC7601e.class, "eّٕۜ"));
        } catch (Throwable th2) {
            th = th2;
            r0 = new Object();
        }
        f15445e = r0;
        if (th != null) {
            f15446e.vip().log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
    }
}
