package defpackage;

import androidx.car.app.model.Alert;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؒٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1216e {
    public static final int[] ad = {-1, -1, -2, -1, -1, -1};
    public static final int[] vip = {1, 0, 2, 0, 1, 0, -2, -1, -3, -1, -1, -1};
    public static final int[] metrica = {-1, -1, -3, -1, -2, -1, 1, 0, 2};

    public static boolean Signature(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static final void ad() {
        throw new IllegalStateException();
    }

    public static final void adcel(int[] iArr, int i) {
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = iArr[i2] + i;
        }
    }

    public static void advert(int[] iArr, int i) {
        long j;
        if (i != 0) {
            long j2 = i & 4294967295L;
            long j3 = (iArr[0] & 4294967295L) + j2;
            iArr[0] = (int) j3;
            long j4 = j3 >> 32;
            if (j4 != 0) {
                long j5 = j4 + (iArr[1] & 4294967295L);
                iArr[1] = (int) j5;
                j4 = j5 >> 32;
            }
            long j6 = (4294967295L & iArr[2]) + j2 + j4;
            iArr[2] = (int) j6;
            j = j6 >> 32;
        } else {
            j = 0;
        }
        if ((j == 0 || AbstractC12797e.tapsense(6, 3, iArr) == 0) && !(iArr[5] == -1 && AbstractC16091e.Signature(iArr, ad))) {
            return;
        }
        vip(iArr);
    }

    public static void amazon(int i, int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[12];
        AbstractC16091e.applovin(iArr, iArr3);
        while (true) {
            mopub(iArr3, iArr2);
            i--;
            if (i <= 0) {
                return;
            } else {
                AbstractC16091e.applovin(iArr2, iArr3);
            }
        }
    }

    public static final Object appmetrica(Function1 function1, AbstractC10731e abstractC10731e) {
        return !AbstractC1452e.ad() ? function1.invoke(abstractC10731e) : AbstractC5336e.advert(abstractC10731e.admob().mo394const(new C1368e()), new C15488e(function1, null, 0), abstractC10731e);
    }

    /* JADX WARN: Code restructure failed: missing block: B:174:0x02ed, code lost:
    
        r0 = license(r6);
        r2 = 1;
        r1 = defpackage.AbstractC1660e.m668extends(r13) + 1;
        r12 = r35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x02f9, code lost:
    
        if (r1 < r12) goto L565;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0a39, code lost:
    
        r2 = r8;
        r35 = r12;
        r46 = r20;
        r61 = r21;
        r12 = r34;
        r8 = r38;
        r20 = r39;
        r15 = r44;
        r7 = r45;
        r38 = r4;
        r21 = r6;
        r44 = r9;
        r22 = r10;
        r6 = r11;
        r39 = r13;
        r10 = r18;
        r11 = r28;
        r13 = r33;
        r9 = r81;
        r3 = r78.vip(r7, r1, r0);
        r9 = (int) (r3 & 4294967295L);
        r6 = (int) (r3 >> 32);
        r7 = r9 - r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0a76, code lost:
    
        if (r7 == 1) goto L568;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0a78, code lost:
    
        r34 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0a7d, code lost:
    
        if (r34 == false) goto L571;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0a7f, code lost:
    
        r0 = -2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0a82, code lost:
    
        r5.m4649package(r1, r0);
        r0 = r8.m2396e(r1, r3);
        r6 = r21;
        r3 = purchase(r3, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0a92, code lost:
    
        if (r7 == 1) goto L575;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0a94, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0a97, code lost:
    
        if (r7 == false) goto L580;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0a99, code lost:
    
        r7 = r5.isPro(r1);
        r4 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x0a9f, code lost:
    
        if (r7 != null) goto L581;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0aa1, code lost:
    
        r7 = new int[r4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x0aa8, code lost:
    
        r22 = r4;
        r4 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0aac, code lost:
    
        if (r4 >= r9) goto L652;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x0aae, code lost:
    
        if (r7 == null) goto L654;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0ab0, code lost:
    
        r7[r4] = r3 - r6[r4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x0ab6, code lost:
    
        r39[r4] = r1;
        r21 = r4;
        r6[r21] = r0.amazon + r3;
        r37[r21].addLast(r0);
        r4 = r21 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x0ac7, code lost:
    
        r4 = (defpackage.C12718e) r5.f36471e;
        r9 = defpackage.Csuper.m4639private(r1, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x0acf, code lost:
    
        if (r9 >= 0) goto L591;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x0ad1, code lost:
    
        if (r7 != null) goto L590;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x0ad3, code lost:
    
        r21 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x0af4, code lost:
    
        if (r3 >= r2) goto L647;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x0af8, code lost:
    
        if (r6[r6] > r2) goto L648;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x0afa, code lost:
    
        r0.advert = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x0ad6, code lost:
    
        r21 = r5;
        r4.add(-(r9 + 1), new defpackage.C13481e(r7, r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x0ae4, code lost:
    
        r21 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x0ae6, code lost:
    
        if (r7 != null) goto L594;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x0ae8, code lost:
    
        r4.firebase(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x0aec, code lost:
    
        ((defpackage.C13481e) r4.get(r9)).vip = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x0aa4, code lost:
    
        r4 = r22;
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x0a96, code lost:
    
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x0a81, code lost:
    
        r0 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x0a7b, code lost:
    
        r34 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x05ff, code lost:
    
        if ((r1 != null ? r1.ad : -1) > r9) goto L322;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x010a, code lost:
    
        r0 = metrica(r14);
        r2 = r14[r0];
        r3 = r15.length;
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0112, code lost:
    
        if (r4 >= r3) goto L620;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0114, code lost:
    
        r35 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x011a, code lost:
    
        if (r14[r4] == r14[r0]) goto L622;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x011c, code lost:
    
        r3 = r15[r4];
        r9 = r15[r0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0120, code lost:
    
        if (r3 >= r9) goto L623;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0122, code lost:
    
        r15[r4] = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0124, code lost:
    
        r4 = r4 + 1;
        r3 = r35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:612:0x039a, code lost:
    
        r2 = license(r7);
        r8 = metrica(r43);
     */
    /* JADX WARN: Code restructure failed: missing block: B:613:0x03a2, code lost:
    
        if (r2 == r8) goto L208;
     */
    /* JADX WARN: Code restructure failed: missing block: B:614:0x03a4, code lost:
    
        r81 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:615:0x03aa, code lost:
    
        if (r7[r2] != r7[r8]) goto L207;
     */
    /* JADX WARN: Code restructure failed: missing block: B:616:0x03ac, code lost:
    
        r2 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:617:0x03b2, code lost:
    
        r0 = r43[r2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:618:0x03b5, code lost:
    
        if (r0 != (-1)) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:619:0x03b7, code lost:
    
        r0 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:620:0x03b8, code lost:
    
        r0 = r5.pro(r0, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:621:0x03bc, code lost:
    
        if (r0 >= 0) goto L231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:622:0x0403, code lost:
    
        r8 = r1;
        r1 = r79;
        r35 = r12;
        r39 = r13;
        r12 = r78.vip(r45, r0, r2);
        r44 = r9;
        r2 = (int) (r12 & 4294967295L);
        r8 = (int) (r12 >> 32);
        r9 = r2 - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:623:0x0421, code lost:
    
        if (r9 == 1) goto L234;
     */
    /* JADX WARN: Code restructure failed: missing block: B:624:0x0423, code lost:
    
        r8 = -2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:625:0x0427, code lost:
    
        r5.m4649package(r0, r8);
        r8 = r38;
        r38 = r4;
        r4 = r8.m2396e(r0, r12);
        r12 = purchase(r12, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:626:0x0437, code lost:
    
        if (r9 == 1) goto L238;
     */
    /* JADX WARN: Code restructure failed: missing block: B:627:0x0439, code lost:
    
        r9 = r5.isPro(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:628:0x0440, code lost:
    
        r13 = r8;
        r0 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:629:0x0446, code lost:
    
        if (r0 >= r2) goto L714;
     */
    /* JADX WARN: Code restructure failed: missing block: B:630:0x0448, code lost:
    
        r46 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:631:0x044c, code lost:
    
        if (r7[r46] == r12) goto L244;
     */
    /* JADX WARN: Code restructure failed: missing block: B:632:0x044e, code lost:
    
        r13 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:633:0x044f, code lost:
    
        r37[r46].addFirst(r4);
        r43[r46] = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:634:0x0456, code lost:
    
        if (r9 != null) goto L247;
     */
    /* JADX WARN: Code restructure failed: missing block: B:635:0x0458, code lost:
    
        r47 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:637:0x045f, code lost:
    
        r7[r46] = (r4.amazon + r12) + r47;
        r0 = r46 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:638:0x045b, code lost:
    
        r47 = r9[r46];
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0129, code lost:
    
        r2 = r5.pro(r2, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:642:0x043e, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:643:0x0425, code lost:
    
        r8 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:645:0x03be, code lost:
    
        r14 = r78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:646:0x03c2, code lost:
    
        if (r1 != false) goto L220;
     */
    /* JADX WARN: Code restructure failed: missing block: B:648:0x03c8, code lost:
    
        if (yandex(r43, r14, r7, r2) == false) goto L219;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x012d, code lost:
    
        if (r2 >= 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:650:0x03f4, code lost:
    
        r44 = r9;
        r39 = r13;
        r13 = r1;
        r1 = r79;
        r9 = r43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:659:0x03ce, code lost:
    
        if (r82 == false) goto L219;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0137, code lost:
    
        r3 = r1.vip(r8, r2, r0);
        r35 = r6;
        r0 = r7;
        r6 = (int) (r3 & 4294967295L);
        r38 = r8;
        r7 = (int) (r3 >> 32);
        r8 = r6 - r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:660:0x03d0, code lost:
    
        r5.m4648new();
        r0 = r43.length;
        r1 = new int[r0];
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:661:0x03d7, code lost:
    
        if (r3 >= r0) goto L717;
     */
    /* JADX WARN: Code restructure failed: missing block: B:662:0x03d9, code lost:
    
        r1[r3] = -1;
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:664:0x03df, code lost:
    
        r0 = r7.length;
        r3 = new int[r0];
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:665:0x03e3, code lost:
    
        if (r4 >= r0) goto L718;
     */
    /* JADX WARN: Code restructure failed: missing block: B:666:0x03e5, code lost:
    
        r3[r4] = r7[r2];
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:669:0x03f3, code lost:
    
        return billing(r14, r79, r1, r3, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0149, code lost:
    
        if (r8 == 1) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:670:0x03ae, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:671:0x03b0, code lost:
    
        r81 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x014b, code lost:
    
        r9 = -2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x014e, code lost:
    
        r5.m4649package(r2, r9);
        r9 = r12.m2396e(r2, r3);
        r3 = purchase(r3, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x015a, code lost:
    
        if (r8 == 1) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x015c, code lost:
    
        r31 = r5.isPro(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0160, code lost:
    
        r4 = r81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0162, code lost:
    
        if (r7 >= r6) goto L624;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0164, code lost:
    
        r14[r7] = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0166, code lost:
    
        if (r31 != null) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0168, code lost:
    
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0169, code lost:
    
        r39 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x016f, code lost:
    
        r0 = (r9.amazon + r3) + r8;
        r15[r7] = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0176, code lost:
    
        if ((r0 + r11) > 0) goto L626;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0178, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0179, code lost:
    
        r7 = r7 + 1;
        r0 = r39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x016c, code lost:
    
        r8 = r31[r7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x014d, code lost:
    
        r9 = r7;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:416:0x07ba  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x0814 A[LOOP:33: B:401:0x0785->B:435:0x0814, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:436:0x0828 A[EDGE_INSN: B:436:0x0828->B:437:0x0828 BREAK  A[LOOP:33: B:401:0x0785->B:435:0x0814], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:439:0x0833  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x08b0  */
    /* JADX WARN: Removed duplicated region for block: B:452:0x08ce A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:467:0x087e  */
    /* JADX WARN: Removed duplicated region for block: B:494:0x08dc  */
    /* JADX WARN: Removed duplicated region for block: B:497:0x08ee  */
    /* JADX WARN: Removed duplicated region for block: B:500:0x0910  */
    /* JADX WARN: Removed duplicated region for block: B:527:0x09b1  */
    /* JADX WARN: Removed duplicated region for block: B:535:0x09c6  */
    /* JADX WARN: Removed duplicated region for block: B:553:0x09c3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:559:0x0a33  */
    /* JADX WARN: Removed duplicated region for block: B:561:0x08df  */
    /* JADX WARN: Removed duplicated region for block: B:567:0x080e  */
    /* JADX WARN: Type inference failed for: r16v26, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r31v6, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.C8076e billing(defpackage.C4036e r78, int r79, int[] r80, int[] r81, boolean r82) {
        /*
            Method dump skipped, instructions count: 3029
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC1216e.billing(eُؖٗ, int, int[], int[], boolean):eًًٝ");
    }

    public static int license(int[] iArr) {
        int length = iArr.length;
        int i = -1;
        int i2 = Alert.DURATION_SHOW_INDEFINITELY;
        for (int i3 = 0; i3 < length; i3++) {
            int i4 = iArr[i3];
            if (-2147483647 <= i4 && i4 < i2) {
                i = i3;
                i2 = i4;
            }
        }
        return i;
    }

    public static void loadAd(int[] iArr, int[] iArr2, int[] iArr3) {
        if (AbstractC16091e.ads(iArr, iArr2, iArr3) != 0) {
            long j = (iArr3[0] & 4294967295L) - 1;
            iArr3[0] = (int) j;
            long j2 = j >> 32;
            if (j2 != 0) {
                long j3 = j2 + (iArr3[1] & 4294967295L);
                iArr3[1] = (int) j3;
                j2 = j3 >> 32;
            }
            long j4 = ((4294967295L & iArr3[2]) - 1) + j2;
            iArr3[2] = (int) j4;
            if ((j4 >> 32) != 0) {
                AbstractC12797e.yandex(6, 3, iArr3);
            }
        }
    }

    public static final int metrica(int[] iArr) {
        int length = iArr.length;
        int i = -1;
        int i2 = RecyclerView.UNDEFINED_DURATION;
        for (int i3 = 0; i3 < length; i3++) {
            int i4 = iArr[i3];
            if (i2 < i4) {
                i = i3;
                i2 = i4;
            }
        }
        return i;
    }

    public static void mopub(int[] iArr, int[] iArr2) {
        long j = iArr[6] & 4294967295L;
        long j2 = iArr[7] & 4294967295L;
        long j3 = (iArr[10] & 4294967295L) + j;
        long j4 = (iArr[11] & 4294967295L) + j2;
        long j5 = (iArr[0] & 4294967295L) + j3;
        int i = (int) j5;
        long j6 = (iArr[1] & 4294967295L) + j4 + (j5 >> 32);
        int i2 = (int) j6;
        iArr2[1] = i2;
        long j7 = j3 + (iArr[8] & 4294967295L);
        long j8 = j4 + (iArr[9] & 4294967295L);
        long j9 = (iArr[2] & 4294967295L) + j7 + (j6 >> 32);
        long j10 = j9 & 4294967295L;
        long j11 = (iArr[3] & 4294967295L) + j8 + (j9 >> 32);
        iArr2[3] = (int) j11;
        long j12 = (iArr[4] & 4294967295L) + (j7 - j) + (j11 >> 32);
        iArr2[4] = (int) j12;
        long j13 = (iArr[5] & 4294967295L) + (j8 - j2) + (j12 >> 32);
        iArr2[5] = (int) j13;
        long j14 = j13 >> 32;
        long j15 = j10 + j14;
        long j16 = j14 + (i & 4294967295L);
        iArr2[0] = (int) j16;
        long j17 = j16 >> 32;
        if (j17 != 0) {
            long j18 = j17 + (i2 & 4294967295L);
            iArr2[1] = (int) j18;
            j15 += j18 >> 32;
        }
        iArr2[2] = (int) j15;
        if (((j15 >> 32) == 0 || AbstractC12797e.tapsense(6, 3, iArr2) == 0) && !(iArr2[5] == -1 && AbstractC16091e.Signature(iArr2, ad))) {
            return;
        }
        vip(iArr2);
    }

    public static final int purchase(long j, int[] iArr) {
        int i = (int) (j & 4294967295L);
        int i2 = RecyclerView.UNDEFINED_DURATION;
        for (int i3 = (int) (j >> 32); i3 < i; i3++) {
            i2 = Math.max(i2, iArr[i3]);
        }
        return i2;
    }

    public static void smaato(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[12];
        AbstractC16091e.applovin(iArr, iArr3);
        mopub(iArr3, iArr2);
    }

    public static void startapp(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[12];
        AbstractC16091e.signatures(iArr, iArr2, iArr4);
        mopub(iArr4, iArr3);
    }

    public static void vip(int[] iArr) {
        long j = (iArr[0] & 4294967295L) + 1;
        iArr[0] = (int) j;
        long j2 = j >> 32;
        if (j2 != 0) {
            long j3 = j2 + (iArr[1] & 4294967295L);
            iArr[1] = (int) j3;
            j2 = j3 >> 32;
        }
        long j4 = (4294967295L & iArr[2]) + 1 + j2;
        iArr[2] = (int) j4;
        if ((j4 >> 32) != 0) {
            AbstractC12797e.tapsense(6, 3, iArr);
        }
    }

    public static final boolean yandex(int[] iArr, C4036e c4036e, int[] iArr2, int i) {
        Csuper csuper = c4036e.subscription;
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (csuper.pro(iArr[i2], i2) == -1 && iArr2[i2] != iArr2[i]) {
                return true;
            }
        }
        int length2 = iArr.length;
        for (int i3 = 0; i3 < length2; i3++) {
            if (csuper.pro(iArr[i3], i3) != -1 && iArr2[i3] >= iArr2[i]) {
                return true;
            }
        }
        int subs = csuper.subs(0);
        return (subs == 0 || subs == -1 || subs == -2) ? false : true;
    }
}
