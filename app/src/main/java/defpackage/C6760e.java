package defpackage;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙۤؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6760e implements InterfaceC10625e {

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final Pattern f13960e = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C2756e f13963e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public LinkedHashMap f13964e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final boolean f13965e;

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public float f13961e = -3.4028235E38f;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public float f13966e = -3.4028235E38f;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C1292e f13962e = new C1292e();

    public C6760e(List list) {
        if (list == null || list.isEmpty()) {
            this.f13965e = false;
            this.f13963e = null;
            return;
        }
        this.f13965e = true;
        byte[] bArr = (byte[]) list.get(0);
        Charset charset = StandardCharsets.UTF_8;
        String str = new String(bArr, charset);
        AbstractC2301e.billing(str.startsWith("Format:"));
        C2756e ad = C2756e.ad(str);
        ad.getClass();
        this.f13963e = ad;
        vip(new C1292e((byte[]) list.get(1)), charset);
    }

    public static int ad(long j, ArrayList arrayList, ArrayList arrayList2) {
        int i;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i = 0;
                break;
            }
            if (((Long) arrayList.get(size)).longValue() == j) {
                return size;
            }
            if (((Long) arrayList.get(size)).longValue() < j) {
                i = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i, Long.valueOf(j));
        arrayList2.add(i, i == 0 ? new ArrayList() : new ArrayList((Collection) arrayList2.get(i - 1)));
        return i;
    }

    public static long metrica(String str) {
        Matcher matcher = f13960e.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String group = matcher.group(1);
        String str2 = AbstractC9413e.ad;
        return (Long.parseLong(matcher.group(4)) * 10000) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(2)) * 60000000) + (Long.parseLong(group) * 3600000000L);
    }

    @Override // defpackage.InterfaceC10625e
    public final /* synthetic */ void reset() {
    }

    @Override // defpackage.InterfaceC10625e
    /* renamed from: this */
    public final /* synthetic */ InterfaceC11455e mo823this(int i, int i2, byte[] bArr) {
        return AbstractC1786e.billing(this, bArr, i2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0280, code lost:
    
        if (r8 == null) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0284, code lost:
    
        if (r22 == (-3.4028235E38f)) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0288, code lost:
    
        if (r19 == (-3.4028235E38f)) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x028a, code lost:
    
        r27 = r8.x / r19;
        r24 = r8.y / r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x02c5, code lost:
    
        r19 = new defpackage.C17817e(r11, r21, null, null, r24, r3, r1, r27, r9, r29, r30, -3.4028235E38f, -3.4028235E38f, false, -16777216, androidx.recyclerview.widget.RecyclerView.UNDEFINED_DURATION, 0.0f, r37);
        r1 = ad(r13, r7, r6);
        r3 = ad(r4, r7, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x02e8, code lost:
    
        if (r1 >= r3) goto L201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x02ea, code lost:
    
        ((java.util.List) r6.get(r1)).add(r19);
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0297, code lost:
    
        r10 = 0.95f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x029f, code lost:
    
        if (r9 == 0) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x02a1, code lost:
    
        r12 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x02a2, code lost:
    
        if (r9 == 1) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x02a4, code lost:
    
        r15 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x02a5, code lost:
    
        if (r9 == 2) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x02a7, code lost:
    
        r16 = -3.4028235E38f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x02b5, code lost:
    
        if (r1 == 0) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x02b7, code lost:
    
        if (r1 == r12) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x02b9, code lost:
    
        if (r1 == r15) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x02bb, code lost:
    
        r10 = -3.4028235E38f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x02c1, code lost:
    
        r24 = r10;
        r27 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x02be, code lost:
    
        r10 = 0.5f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x02c0, code lost:
    
        r10 = 0.05f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x02aa, code lost:
    
        r16 = 0.95f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x02ad, code lost:
    
        r15 = 2;
        r16 = 0.5f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x02b1, code lost:
    
        r12 = 1;
        r15 = 2;
        r16 = 0.05f;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cc  */
    @Override // defpackage.InterfaceC10625e
    /* renamed from: transient */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo825transient(byte[] r44, int r45, int r46, defpackage.C14033e r47, defpackage.InterfaceC8427e r48) {
        /*
            Method dump skipped, instructions count: 1000
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6760e.mo825transient(byte[], int, int, eٓٗۢ, eٌؑۘ):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:185:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void vip(defpackage.C1292e r39, java.nio.charset.Charset r40) {
        /*
            Method dump skipped, instructions count: 850
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6760e.vip(eؒۙۚ, java.nio.charset.Charset):void");
    }
}
