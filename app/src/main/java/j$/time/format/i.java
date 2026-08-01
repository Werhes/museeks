package j$.time.format;

import j$.util.concurrent.ConcurrentHashMap;
import org.conscrypt.BuildConfig;

/* loaded from: classes2.dex */
public final class i implements e {
    public static final ConcurrentHashMap c = new ConcurrentHashMap(16, 0.75f, 2);
    public final FormatStyle a;
    public final FormatStyle b;

    public i(FormatStyle formatStyle, FormatStyle formatStyle2) {
        this.a = formatStyle;
        this.b = formatStyle2;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:83:0x01be. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:84:0x01c1. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:85:0x01c4. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:170:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x05b4  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x05cd A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final j$.time.format.DateTimeFormatter a(java.util.Locale r25, j$.time.chrono.j r26) {
        /*
            Method dump skipped, instructions count: 1646
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.format.i.a(java.util.Locale, j$.time.chrono.j):j$.time.format.DateTimeFormatter");
    }

    @Override // j$.time.format.e
    public final boolean i(x xVar, StringBuilder sb) {
        a(xVar.b.b, j$.com.android.tools.r8.a.P(xVar.a)).b().i(xVar, sb);
        return true;
    }

    @Override // j$.time.format.e
    public final int j(v vVar, CharSequence charSequence, int i) {
        return a(vVar.a.b, vVar.d()).b().j(vVar, charSequence, i);
    }

    public final String toString() {
        Object obj = BuildConfig.FLAVOR;
        Object obj2 = this.a;
        if (obj2 == null) {
            obj2 = BuildConfig.FLAVOR;
        }
        Object obj3 = this.b;
        if (obj3 != null) {
            obj = obj3;
        }
        return "Localized(" + obj2 + "," + obj + ")";
    }
}
