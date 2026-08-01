package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؙۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C6272e implements InterfaceC11542e {
    public static final C7468e appmetrica;
    public static final String license;
    public final InterfaceC17935e ad;
    public final String metrica;
    public final C16628e vip;

    /* JADX WARN: Type inference failed for: r0v4, types: [eؙؚۜ, eًؙۡ] */
    static {
        String canonicalName = C6272e.class.getCanonicalName();
        int m1878throw = AbstractC5304e.m1878throw(0, 6, canonicalName, ".");
        license = m1878throw == -1 ? BuildConfig.FLAVOR : canonicalName.substring(0, m1878throw);
        appmetrica = new C6272e("NO_LOCKS", C12575e.f25219e);
    }

    public C6272e(String str) {
        this(str, new C16089e(new ReentrantLock()));
    }

    public C6272e(String str, InterfaceC17935e interfaceC17935e) {
        C16628e c16628e = C16628e.f32612e;
        this.ad = interfaceC17935e;
        this.vip = c16628e;
        this.metrica = str;
    }

    public static void appmetrica(AssertionError assertionError) {
        StackTraceElement[] stackTrace = assertionError.getStackTrace();
        int length = stackTrace.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (!stackTrace[i].getClassName().startsWith(license)) {
                break;
            } else {
                i++;
            }
        }
        List subList = Arrays.asList(stackTrace).subList(i, length);
        assertionError.setStackTrace((StackTraceElement[]) subList.toArray(new StackTraceElement[subList.size()]));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eٖؑٚ, eٖۥٌ] */
    public final C0394e ad(Function0 function0) {
        return new C16622e(this, function0);
    }

    public C16722e license(Object obj, String str) {
        StringBuilder sb = new StringBuilder("Recursion detected ");
        sb.append(str);
        sb.append(obj == null ? BuildConfig.FLAVOR : AbstractC1634e.advert(obj, "on input: "));
        sb.append(" under ");
        sb.append(this);
        AssertionError assertionError = new AssertionError(sb.toString());
        appmetrica(assertionError);
        throw assertionError;
    }

    public final C8286e metrica(Function1 function1) {
        return new C8286e(1, this, new ConcurrentHashMap(3, 1.0f, 2), function1);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(" (");
        return AbstractC1786e.signatures(sb, this.metrica, ")");
    }

    public final C1159e vip(Function1 function1) {
        return new C1159e(this, new ConcurrentHashMap(3, 1.0f, 2), function1, 1);
    }
}
