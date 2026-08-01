package defpackage;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؘٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9454e implements InterfaceC10625e {

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final Pattern f18793e = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*");

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final Pattern f18792e = Pattern.compile("\\{\\\\.*?\\}");

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final StringBuilder f18796e = new StringBuilder();

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final ArrayList f18795e = new ArrayList();

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C1292e f18794e = new C1292e();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0070, code lost:
    
        r1 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x008c, code lost:
    
        if (r22.equals("{\\an9}") != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x009c, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0093, code lost:
    
        if (r22.equals("{\\an8}") != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009a, code lost:
    
        if (r22.equals("{\\an7}") != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b1, code lost:
    
        if (r22.equals("{\\an3}") != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c1, code lost:
    
        r3 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b8, code lost:
    
        if (r22.equals("{\\an2}") != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00bf, code lost:
    
        if (r22.equals("{\\an1}") != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0054, code lost:
    
        if (r22.equals("{\\an7}") != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x007d, code lost:
    
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x005b, code lost:
    
        if (r22.equals("{\\an6}") != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0067, code lost:
    
        if (r22.equals("{\\an4}") != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x006e, code lost:
    
        if (r22.equals("{\\an3}") != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x007b, code lost:
    
        if (r22.equals("{\\an1}") != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0048, code lost:
    
        if (r22.equals("{\\an9}") != false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.C17817e ad(android.text.Spanned r21, java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C9454e.ad(android.text.Spanned, java.lang.String):eِ٘٘");
    }

    public static long vip(Matcher matcher, int i) {
        String group = matcher.group(i + 1);
        long parseLong = group != null ? Long.parseLong(group) * 3600000 : 0L;
        String group2 = matcher.group(i + 2);
        group2.getClass();
        long parseLong2 = (Long.parseLong(group2) * 60000) + parseLong;
        String group3 = matcher.group(i + 3);
        group3.getClass();
        long parseLong3 = (Long.parseLong(group3) * 1000) + parseLong2;
        String group4 = matcher.group(i + 4);
        if (group4 != null) {
            parseLong3 += Long.parseLong(group4);
        }
        return parseLong3 * 1000;
    }

    @Override // defpackage.InterfaceC10625e
    public final /* synthetic */ void reset() {
    }

    @Override // defpackage.InterfaceC10625e
    /* renamed from: this */
    public final /* synthetic */ InterfaceC11455e mo823this(int i, int i2, byte[] bArr) {
        return AbstractC1786e.billing(this, bArr, i2);
    }

    @Override // defpackage.InterfaceC10625e
    /* renamed from: transient */
    public final void mo825transient(byte[] bArr, int i, int i2, C14033e c14033e, InterfaceC8427e interfaceC8427e) {
        String amazon;
        String str;
        C9454e c9454e = this;
        long j = c14033e.vip;
        C1292e c1292e = c9454e.f18794e;
        c1292e.m570throw(i + i2, bArr);
        c1292e.m571try(i);
        Charset m567native = c1292e.m567native();
        if (m567native == null) {
            m567native = StandardCharsets.UTF_8;
        }
        long j2 = -9223372036854775807L;
        ArrayList arrayList = (j == -9223372036854775807L || !c14033e.ad) ? null : new ArrayList();
        while (true) {
            String amazon2 = c1292e.amazon(m567native);
            if (amazon2 == null) {
                break;
            }
            if (!amazon2.isEmpty()) {
                try {
                    Integer.parseInt(amazon2);
                    amazon = c1292e.amazon(m567native);
                } catch (NumberFormatException unused) {
                    AbstractC2803e.smaato("SubripParser", "Skipping invalid index: ".concat(amazon2));
                }
                if (amazon == null) {
                    AbstractC2803e.smaato("SubripParser", "Unexpected end");
                    break;
                }
                Matcher matcher = f18793e.matcher(amazon);
                if (matcher.matches()) {
                    long vip = vip(matcher, 1);
                    long vip2 = vip(matcher, 6);
                    StringBuilder sb = c9454e.f18796e;
                    long j3 = j2;
                    sb.setLength(0);
                    ArrayList arrayList2 = c9454e.f18795e;
                    arrayList2.clear();
                    for (String amazon3 = c1292e.amazon(m567native); !TextUtils.isEmpty(amazon3); amazon3 = c1292e.amazon(m567native)) {
                        if (sb.length() > 0) {
                            sb.append("<br>");
                        }
                        String trim = amazon3.trim();
                        StringBuilder sb2 = new StringBuilder(trim);
                        Matcher matcher2 = f18792e.matcher(trim);
                        int i3 = 0;
                        while (matcher2.find()) {
                            Matcher matcher3 = matcher2;
                            String group = matcher3.group();
                            arrayList2.add(group);
                            int start = matcher3.start() - i3;
                            int length = group.length();
                            sb2.replace(start, start + length, BuildConfig.FLAVOR);
                            i3 += length;
                            matcher2 = matcher3;
                            j = j;
                        }
                        sb.append(sb2.toString());
                    }
                    long j4 = j;
                    Spanned fromHtml = Html.fromHtml(sb.toString());
                    int i4 = 0;
                    while (true) {
                        if (i4 >= arrayList2.size()) {
                            str = null;
                            break;
                        }
                        str = (String) arrayList2.get(i4);
                        if (str.matches("\\{\\\\an[1-9]\\}")) {
                            break;
                        } else {
                            i4++;
                        }
                    }
                    if (j4 == j3 || vip2 >= j4) {
                        interfaceC8427e.accept(new C17169e(vip, vip2 - vip, AbstractC17475e.ads(ad(fromHtml, str))));
                    } else if (arrayList != null) {
                        arrayList.add(new C17169e(vip, vip2 - vip, AbstractC17475e.ads(ad(fromHtml, str))));
                    }
                    c9454e = this;
                    j2 = j3;
                    j = j4;
                } else {
                    AbstractC2803e.smaato("SubripParser", "Skipping invalid timing: ".concat(amazon));
                    c9454e = this;
                }
            }
        }
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                interfaceC8427e.accept((C17169e) it.next());
            }
        }
    }
}
