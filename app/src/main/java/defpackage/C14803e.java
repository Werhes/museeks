package defpackage;

import java.util.Locale;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔٚؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C14803e extends RuntimeException {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final /* synthetic */ int f29331e = 0;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f29332e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14803e() {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.f29332e = 16;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14803e(int i, String str, Throwable th) {
        super(str, th);
        this.f29332e = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14803e(String str) {
        super(str.toString());
        this.f29332e = 11;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14803e(String str, int i) {
        super(String.format(Locale.getDefault(), "Unable to find next atom because identifier is invalid %s, length:%d", str, Integer.valueOf(i)));
        this.f29332e = 7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14803e(String str, int i, byte b) {
        super(str);
        this.f29332e = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14803e(Throwable th, int i) {
        super(th);
        this.f29332e = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14803e(Object[] objArr) {
        super(String.format(Locale.getDefault(), "DO not know how to create this atom type %s", objArr));
        this.f29332e = 17;
    }

    private final synchronized Throwable ad() {
        return this;
    }

    public static String license(int i, int i2, String str, String str2) {
        if (i2 < 0) {
            i2 = str2.length();
        }
        StringBuilder sb = new StringBuilder(str);
        sb.append(": ");
        if (i > 8) {
            sb.append("...");
            sb.append((CharSequence) str2, i - 5, i);
        } else {
            sb.append((CharSequence) str2, 0, i);
        }
        sb.append('[');
        sb.append(str2.substring(i, i2));
        sb.append(']');
        if (str2.length() - i2 > 8) {
            sb.append((CharSequence) str2, i2, i2 + 5);
            sb.append("...");
        } else {
            sb.append((CharSequence) str2, i2, str2.length());
        }
        return sb.toString();
    }

    public static C14803e metrica(String str, int i, String str2) {
        return new C14803e(license(i, i + 1, str, str2), 20, (byte) 0);
    }

    public static C14803e vip(int i, int i2, String str, String str2) {
        return new C14803e(license(i, i2, str, str2), 20, (byte) 0);
    }

    @Override // java.lang.Throwable
    public synchronized Throwable fillInStackTrace() {
        switch (this.f29332e) {
            case 20:
                ad();
                return this;
            default:
                return super.fillInStackTrace();
        }
    }
}
