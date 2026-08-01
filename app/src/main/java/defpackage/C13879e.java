package defpackage;

import android.text.TextUtils;
import android.util.Log;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؙٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13879e extends AbstractC7884e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public long f27492e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public final C14937e f27493e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public final C14937e f27494e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final C14937e f27495e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public final C14937e f27496e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public final C14937e f27497e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final C14937e f27498e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final C14937e f27499e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public char f27500e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final C14937e f27501e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final C14937e f27502e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public String f27503e;

    public C13879e(C6936e c6936e) {
        super(c6936e);
        this.f27500e = (char) 0;
        this.f27492e = -1L;
        this.f27502e = new C14937e(this, 6, false, false);
        this.f27498e = new C14937e(this, 6, true, false);
        this.f27501e = new C14937e(this, 6, false, true);
        this.f27495e = new C14937e(this, 5, false, false);
        this.f27499e = new C14937e(this, 5, true, false);
        this.f27494e = new C14937e(this, 5, false, true);
        this.f27493e = new C14937e(this, 4, false, false);
        this.f27496e = new C14937e(this, 3, false, false);
        this.f27497e = new C14937e(this, 2, false, false);
    }

    /* renamed from: eؙٚؑ, reason: contains not printable characters */
    public static C16193e m3689e(String str) {
        if (str == null) {
            return null;
        }
        return new C16193e(str);
    }

    /* renamed from: eؚؚْ, reason: contains not printable characters */
    public static String m3690e(boolean z, String str, Object obj, Object obj2, Object obj3) {
        String m3691e = m3691e(obj, z);
        String m3691e2 = m3691e(obj2, z);
        String m3691e3 = m3691e(obj3, z);
        StringBuilder sb = new StringBuilder();
        String str2 = BuildConfig.FLAVOR;
        if (str == null) {
            str = BuildConfig.FLAVOR;
        }
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(m3691e)) {
            sb.append(str2);
            sb.append(m3691e);
            str2 = ", ";
        }
        if (TextUtils.isEmpty(m3691e2)) {
            str3 = str2;
        } else {
            sb.append(str2);
            sb.append(m3691e2);
        }
        if (!TextUtils.isEmpty(m3691e3)) {
            sb.append(str3);
            sb.append(m3691e3);
        }
        return sb.toString();
    }

    /* renamed from: eًٜ٘, reason: contains not printable characters */
    public static String m3691e(Object obj, boolean z) {
        int lastIndexOf;
        String className;
        int lastIndexOf2;
        String str = BuildConfig.FLAVOR;
        if (obj == null) {
            return BuildConfig.FLAVOR;
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Long) {
            if (!z) {
                return obj.toString();
            }
            Long l = (Long) obj;
            if (Math.abs(l.longValue()) < 100) {
                return obj.toString();
            }
            char charAt = obj.toString().charAt(0);
            String valueOf = String.valueOf(Math.abs(l.longValue()));
            long round = Math.round(Math.pow(10.0d, valueOf.length() - 1));
            long round2 = Math.round(Math.pow(10.0d, valueOf.length()) - 1.0d);
            int length = String.valueOf(round).length();
            if (charAt == '-') {
                str = "-";
            }
            StringBuilder sb = new StringBuilder(str.length() + str.length() + length + 3 + String.valueOf(round2).length());
            sb.append(str);
            sb.append(round);
            sb.append("...");
            sb.append(str);
            sb.append(round2);
            return sb.toString();
        }
        if (obj instanceof Boolean) {
            return obj.toString();
        }
        if (!(obj instanceof Throwable)) {
            return obj instanceof C16193e ? ((C16193e) obj).ad : z ? "-" : obj.toString();
        }
        Throwable th = (Throwable) obj;
        StringBuilder sb2 = new StringBuilder(z ? th.getClass().getName() : th.toString());
        String canonicalName = C6936e.class.getCanonicalName();
        String substring = (TextUtils.isEmpty(canonicalName) || (lastIndexOf = canonicalName.lastIndexOf(46)) == -1) ? BuildConfig.FLAVOR : canonicalName.substring(0, lastIndexOf);
        StackTraceElement[] stackTrace = th.getStackTrace();
        int length2 = stackTrace.length;
        int i = 0;
        while (true) {
            if (i >= length2) {
                break;
            }
            StackTraceElement stackTraceElement = stackTrace[i];
            if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null) {
                if (((TextUtils.isEmpty(className) || (lastIndexOf2 = className.lastIndexOf(46)) == -1) ? BuildConfig.FLAVOR : className.substring(0, lastIndexOf2)).equals(substring)) {
                    sb2.append(": ");
                    sb2.append(stackTraceElement);
                    break;
                }
            }
            i++;
        }
        return sb2.toString();
    }

    /* renamed from: eّؑۛ, reason: contains not printable characters */
    public final C14937e m3692e() {
        return this.f27495e;
    }

    /* renamed from: eٖؗۘ, reason: contains not printable characters */
    public final C14937e m3693e() {
        return this.f27496e;
    }

    @Override // defpackage.AbstractC7884e
    /* renamed from: eؚۚۦ */
    public final boolean mo487e() {
        return false;
    }

    /* renamed from: eًؚْ, reason: contains not printable characters */
    public final C14937e m3694e() {
        return this.f27497e;
    }

    /* renamed from: eُِۤ, reason: contains not printable characters */
    public final String m3695e() {
        String str;
        synchronized (this) {
            try {
                if (this.f27503e == null) {
                    ((C6936e) ((C6936e) this.f36443e).f14221e.f36443e).getClass();
                    this.f27503e = "FA";
                }
                AbstractC9528e.startapp(this.f27503e);
                str = this.f27503e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    /* renamed from: eَٖؑ, reason: contains not printable characters */
    public final void m3696e(int i, boolean z, boolean z2, String str, Object obj, Object obj2, Object obj3) {
        if (!z && Log.isLoggable(m3695e(), i)) {
            Log.println(i, m3695e(), m3690e(false, str, obj, obj2, obj3));
        }
        if (z2 || i < 5) {
            return;
        }
        AbstractC9528e.startapp(str);
        C6915e c6915e = ((C6936e) this.f36443e).f14226e;
        if (c6915e == null) {
            Log.println(6, m3695e(), "Scheduler not set. Not logging error/warn");
        } else {
            if (!c6915e.f15961e) {
                Log.println(6, m3695e(), "Scheduler not initialized. Not logging error/warn");
                return;
            }
            if (i >= 9) {
                i = 8;
            }
            c6915e.m2254e(new RunnableC7799e(this, i, str, obj, obj2, obj3));
        }
    }

    /* renamed from: eٖٕٚ, reason: contains not printable characters */
    public final C14937e m3697e() {
        return this.f27502e;
    }
}
