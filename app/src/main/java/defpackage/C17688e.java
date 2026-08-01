package defpackage;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُ٘ۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17688e extends C11325e {

    /* renamed from: eؑۥؘ, reason: contains not printable characters */
    public C0724e f34649e;

    /* renamed from: eٟؒؗ, reason: contains not printable characters */
    public WeakReference f34650e;

    /* renamed from: eؒۖۗ, reason: contains not printable characters */
    public int f34651e;

    /* renamed from: eؒۤۨ, reason: contains not printable characters */
    public int f34652e;

    /* renamed from: eؘْؖ, reason: contains not printable characters */
    public boolean f34653e;

    /* renamed from: eٌؖۡ, reason: contains not printable characters */
    public int f34654e;

    /* renamed from: eؘؕۥ, reason: contains not printable characters */
    public int f34655e;

    /* renamed from: eؘُٔ, reason: contains not printable characters */
    public C11468e[] f34656e;

    /* renamed from: eؘٕۚ, reason: contains not printable characters */
    public final HashSet f34657e;

    /* renamed from: eؚؚؓ, reason: contains not printable characters */
    public WeakReference f34658e;

    /* renamed from: eؚۜؑ, reason: contains not printable characters */
    public boolean f34659e;

    /* renamed from: eَٖٓ, reason: contains not printable characters */
    public WeakReference f34661e;

    /* renamed from: eُٓؓ, reason: contains not printable characters */
    public final C17677e f34662e;

    /* renamed from: eُؚٕ, reason: contains not printable characters */
    public final C14341e f34663e;

    /* renamed from: eِؗؓ, reason: contains not printable characters */
    public boolean f34664e;

    /* renamed from: eٓٛۢ, reason: contains not printable characters */
    public C11468e[] f34665e;

    /* renamed from: eّٔؖ, reason: contains not printable characters */
    public int f34666e;

    /* renamed from: eٕؓٝ, reason: contains not printable characters */
    public WeakReference f34667e;

    /* renamed from: eٟٗۦ, reason: contains not printable characters */
    public int f34668e;

    /* renamed from: e٘ٔ٘, reason: contains not printable characters */
    public final C10039e f34669e;

    /* renamed from: eؙٟ٘, reason: contains not printable characters */
    public ArrayList f34670e = new ArrayList();

    /* renamed from: eًًؓ, reason: contains not printable characters */
    public final C18478e f34660e = new C18478e(this);

    /* JADX WARN: Type inference failed for: r0v2, types: [eۣٓٚ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, eَؕٔ] */
    public C17688e() {
        ?? obj = new Object();
        obj.f28371e = true;
        obj.f28368e = true;
        obj.f28366e = new ArrayList();
        new ArrayList();
        obj.f28373e = null;
        obj.f28372e = new Object();
        obj.f28369e = new ArrayList();
        obj.f28367e = this;
        obj.f28370e = this;
        this.f34663e = obj;
        this.f34649e = null;
        this.f34653e = false;
        this.f34662e = new C17677e();
        this.f34668e = 0;
        this.f34655e = 0;
        this.f34656e = new C11468e[4];
        this.f34665e = new C11468e[4];
        this.f34651e = 257;
        this.f34664e = false;
        this.f34659e = false;
        this.f34661e = null;
        this.f34650e = null;
        this.f34658e = null;
        this.f34667e = null;
        this.f34657e = new HashSet();
        this.f34669e = new Object();
    }

    /* renamed from: final, reason: not valid java name */
    public static void m4379final(C11325e c11325e, C0724e c0724e, C10039e c10039e) {
        int i;
        int i2;
        if (c0724e == null) {
            return;
        }
        int i3 = c11325e.f22752return;
        int[] iArr = c11325e.pro;
        if (i3 == 8 || (c11325e instanceof C0913e) || (c11325e instanceof C15380e)) {
            c10039e.appmetrica = 0;
            c10039e.purchase = 0;
            return;
        }
        int[] iArr2 = c11325e.f22751public;
        c10039e.ad = iArr2[0];
        c10039e.vip = iArr2[1];
        c10039e.metrica = c11325e.admob();
        c10039e.license = c11325e.mopub();
        c10039e.startapp = false;
        c10039e.adcel = 0;
        boolean z = c10039e.ad == 3;
        boolean z2 = c10039e.vip == 3;
        boolean z3 = z && c11325e.f22755super > 0.0f;
        boolean z4 = z2 && c11325e.f22755super > 0.0f;
        if (z && c11325e.pro(0) && c11325e.subscription == 0 && !z3) {
            c10039e.ad = 2;
            if (z2 && c11325e.remoteconfig == 0) {
                c10039e.ad = 1;
            }
            z = false;
        }
        if (z2 && c11325e.pro(1) && c11325e.remoteconfig == 0 && !z4) {
            c10039e.vip = 2;
            if (z && c11325e.subscription == 0) {
                c10039e.vip = 1;
            }
            z2 = false;
        }
        if (c11325e.ads()) {
            c10039e.ad = 1;
            z = false;
        }
        if (c11325e.premium()) {
            c10039e.vip = 1;
            z2 = false;
        }
        if (z3) {
            if (iArr[0] == 4) {
                c10039e.ad = 1;
            } else if (!z2) {
                if (c10039e.vip == 1) {
                    i2 = c10039e.license;
                } else {
                    c10039e.ad = 2;
                    c0724e.vip(c11325e, c10039e);
                    i2 = c10039e.purchase;
                }
                c10039e.ad = 1;
                c10039e.metrica = (int) (c11325e.f22755super * i2);
            }
        }
        if (z4) {
            if (iArr[1] == 4) {
                c10039e.vip = 1;
            } else if (!z) {
                if (c10039e.ad == 1) {
                    i = c10039e.metrica;
                } else {
                    c10039e.vip = 2;
                    c0724e.vip(c11325e, c10039e);
                    i = c10039e.appmetrica;
                }
                c10039e.vip = 1;
                if (c11325e.f22747new == -1) {
                    c10039e.license = (int) (i / c11325e.f22755super);
                } else {
                    c10039e.license = (int) (c11325e.f22755super * i);
                }
            }
        }
        c0724e.vip(c11325e, c10039e);
        c11325e.m3195protected(c10039e.appmetrica);
        c11325e.m3197throw(c10039e.purchase);
        c11325e.firebase = c10039e.yandex;
        c11325e.m3196this(c10039e.billing);
        c10039e.adcel = 0;
    }

    @Override // defpackage.C11325e
    public final void amazon(StringBuilder sb) {
        sb.append(this.adcel + ":{\n");
        StringBuilder sb2 = new StringBuilder("  actualWidth:");
        sb2.append(this.f22731catch);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("  actualHeight:" + this.f22738final);
        sb.append("\n");
        Iterator it = this.f34670e.iterator();
        while (it.hasNext()) {
            ((C11325e) it.next()).amazon(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }

    @Override // defpackage.C11325e
    /* renamed from: break */
    public final void mo3191break(boolean z, boolean z2) {
        super.mo3191break(z, z2);
        int size = this.f34670e.size();
        for (int i = 0; i < size; i++) {
            ((C11325e) this.f34670e.get(i)).mo3191break(z, z2);
        }
    }

    /* renamed from: case, reason: not valid java name */
    public final boolean m4380case(int i, boolean z) {
        boolean z2;
        boolean z3;
        C14341e c14341e = this.f34663e;
        ArrayList arrayList = (ArrayList) c14341e.f28366e;
        C17688e c17688e = (C17688e) c14341e.f28367e;
        boolean z4 = false;
        int adcel = c17688e.adcel(0);
        int[] iArr = c17688e.f22751public;
        int adcel2 = c17688e.adcel(1);
        int subscription = c17688e.subscription();
        int remoteconfig = c17688e.remoteconfig();
        if (z && (adcel == 2 || adcel2 == 2)) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z3 = z;
                    break;
                }
                AbstractC17471e abstractC17471e = (AbstractC17471e) it.next();
                if (abstractC17471e.purchase == i && !abstractC17471e.mopub()) {
                    z3 = false;
                    break;
                }
            }
            if (i == 0) {
                if (z3 && adcel == 2) {
                    c17688e.m3199while(1);
                    c17688e.m3195protected(c14341e.appmetrica(c17688e, 0));
                    c17688e.license.appmetrica.license(c17688e.admob());
                }
            } else if (z3 && adcel2 == 2) {
                c17688e.m3198try(1);
                c17688e.m3197throw(c14341e.appmetrica(c17688e, 1));
                c17688e.appmetrica.appmetrica.license(c17688e.mopub());
            }
        }
        if (i == 0) {
            int i2 = iArr[0];
            if (i2 == 1 || i2 == 4) {
                int admob = c17688e.admob() + subscription;
                c17688e.license.startapp.license(admob);
                c17688e.license.appmetrica.license(admob - subscription);
                z2 = true;
            }
            z2 = false;
        } else {
            int i3 = iArr[1];
            if (i3 == 1 || i3 == 4) {
                int mopub = c17688e.mopub() + remoteconfig;
                c17688e.appmetrica.startapp.license(mopub);
                c17688e.appmetrica.appmetrica.license(mopub - remoteconfig);
                z2 = true;
            }
            z2 = false;
        }
        c14341e.yandex();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            AbstractC17471e abstractC17471e2 = (AbstractC17471e) it2.next();
            if (abstractC17471e2.purchase == i && (abstractC17471e2.vip != c17688e || abstractC17471e2.billing)) {
                abstractC17471e2.appmetrica();
            }
        }
        Iterator it3 = arrayList.iterator();
        while (true) {
            if (!it3.hasNext()) {
                z4 = true;
                break;
            }
            AbstractC17471e abstractC17471e3 = (AbstractC17471e) it3.next();
            if (abstractC17471e3.purchase == i && (z2 || abstractC17471e3.vip != c17688e)) {
                if (!abstractC17471e3.yandex.adcel) {
                    break;
                }
                if (!abstractC17471e3.startapp.adcel) {
                    break;
                }
                if (!(abstractC17471e3 instanceof C10396e) && !abstractC17471e3.appmetrica.adcel) {
                    break;
                }
            }
        }
        c17688e.m3199while(adcel);
        c17688e.m3198try(adcel2);
        return z4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:215:0x06b6  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x06d3  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x07d0  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x082e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:282:0x083b A[LOOP:14: B:281:0x0839->B:282:0x083b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:295:0x08a1  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x08c1  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x08ce  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0909  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x090b  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0905  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x08ca  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x08ae  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0811  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x091a  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:599:0x061c  */
    /* JADX WARN: Removed duplicated region for block: B:617:0x0648 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:620:0x064d  */
    /* JADX WARN: Removed duplicated region for block: B:627:0x0663  */
    /* JADX WARN: Type inference failed for: r5v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v98, types: [java.lang.Object, eَؕٔ] */
    /* renamed from: catch, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m4381catch() {
        /*
            Method dump skipped, instructions count: 2344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C17688e.m4381catch():void");
    }

    @Override // defpackage.C11325e
    /* renamed from: class */
    public final void mo3192class(C0909e c0909e) {
        super.mo3192class(c0909e);
        int size = this.f34670e.size();
        for (int i = 0; i < size; i++) {
            ((C11325e) this.f34670e.get(i)).mo3192class(c0909e);
        }
    }

    /* renamed from: default, reason: not valid java name */
    public final void m4382default(C11325e c11325e, int i) {
        if (i == 0) {
            int i2 = this.f34668e + 1;
            C11468e[] c11468eArr = this.f34665e;
            if (i2 >= c11468eArr.length) {
                this.f34665e = (C11468e[]) Arrays.copyOf(c11468eArr, c11468eArr.length * 2);
            }
            C11468e[] c11468eArr2 = this.f34665e;
            int i3 = this.f34668e;
            c11468eArr2[i3] = new C11468e(c11325e, 0, this.f34653e);
            this.f34668e = i3 + 1;
            return;
        }
        if (i == 1) {
            int i4 = this.f34655e + 1;
            C11468e[] c11468eArr3 = this.f34656e;
            if (i4 >= c11468eArr3.length) {
                this.f34656e = (C11468e[]) Arrays.copyOf(c11468eArr3, c11468eArr3.length * 2);
            }
            C11468e[] c11468eArr4 = this.f34656e;
            int i5 = this.f34655e;
            c11468eArr4[i5] = new C11468e(c11325e, 1, this.f34653e);
            this.f34655e = i5 + 1;
        }
    }

    /* renamed from: implements, reason: not valid java name */
    public final void m4383implements(C17677e c17677e) {
        C17688e c17688e;
        C17677e c17677e2;
        boolean m4384super = m4384super(64);
        vip(c17677e, m4384super);
        int size = this.f34670e.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            C11325e c11325e = (C11325e) this.f34670e.get(i);
            boolean[] zArr = c11325e.f22742implements;
            zArr[0] = false;
            zArr[1] = false;
            if (c11325e instanceof C15380e) {
                z = true;
            }
        }
        if (z) {
            for (int i2 = 0; i2 < size; i2++) {
                C11325e c11325e2 = (C11325e) this.f34670e.get(i2);
                if (c11325e2 instanceof C15380e) {
                    C15380e c15380e = (C15380e) c11325e2;
                    for (int i3 = 0; i3 < c15380e.f28080e; i3++) {
                        C11325e c11325e3 = c15380e.f28081e[i3];
                        if (c15380e.f30318e || c11325e3.metrica()) {
                            int i4 = c15380e.f30320e;
                            if (i4 == 0 || i4 == 1) {
                                c11325e3.f22742implements[0] = true;
                            } else if (i4 == 2 || i4 == 3) {
                                c11325e3.f22742implements[1] = true;
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = this.f34657e;
        hashSet.clear();
        for (int i5 = 0; i5 < size; i5++) {
            C11325e c11325e4 = (C11325e) this.f34670e.get(i5);
            c11325e4.getClass();
            boolean z2 = c11325e4 instanceof C4955e;
            if (z2 || (c11325e4 instanceof C0913e)) {
                if (z2) {
                    hashSet.add(c11325e4);
                } else {
                    c11325e4.vip(c17677e, m4384super);
                }
            }
        }
        while (hashSet.size() > 0) {
            int size2 = hashSet.size();
            Iterator it = hashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C4955e c4955e = (C4955e) ((C11325e) it.next());
                for (int i6 = 0; i6 < c4955e.f28080e; i6++) {
                    if (hashSet.contains(c4955e.f28081e[i6])) {
                        c4955e.vip(c17677e, m4384super);
                        hashSet.remove(c4955e);
                        break;
                    }
                }
            }
            if (size2 == hashSet.size()) {
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ((C11325e) it2.next()).vip(c17677e, m4384super);
                }
                hashSet.clear();
            }
        }
        if (C17677e.admob) {
            HashSet hashSet2 = new HashSet();
            for (int i7 = 0; i7 < size; i7++) {
                C11325e c11325e5 = (C11325e) this.f34670e.get(i7);
                c11325e5.getClass();
                if (!(c11325e5 instanceof C4955e) && !(c11325e5 instanceof C0913e)) {
                    hashSet2.add(c11325e5);
                }
            }
            c17688e = this;
            c17677e2 = c17677e;
            c17688e.ad(this, c17677e2, hashSet2, this.f22751public[0] == 2 ? 0 : 1, false);
            Iterator it3 = hashSet2.iterator();
            while (it3.hasNext()) {
                C11325e c11325e6 = (C11325e) it3.next();
                AbstractC12511e.license(this, c17677e2, c11325e6);
                c11325e6.vip(c17677e2, m4384super);
            }
        } else {
            c17688e = this;
            c17677e2 = c17677e;
            for (int i8 = 0; i8 < size; i8++) {
                C11325e c11325e7 = (C11325e) c17688e.f34670e.get(i8);
                if (c11325e7 instanceof C17688e) {
                    int[] iArr = c11325e7.f22751public;
                    int i9 = iArr[0];
                    int i10 = iArr[1];
                    if (i9 == 2) {
                        c11325e7.m3199while(1);
                    }
                    if (i10 == 2) {
                        c11325e7.m3198try(1);
                    }
                    c11325e7.vip(c17677e2, m4384super);
                    if (i9 == 2) {
                        c11325e7.m3199while(i9);
                    }
                    if (i10 == 2) {
                        c11325e7.m3198try(i10);
                    }
                } else {
                    AbstractC12511e.license(this, c17677e2, c11325e7);
                    if (!(c11325e7 instanceof C4955e) && !(c11325e7 instanceof C0913e)) {
                        c11325e7.vip(c17677e2, m4384super);
                    }
                }
            }
        }
        if (c17688e.f34668e > 0) {
            AbstractC4306e.ad(this, c17677e2, null, 0);
        }
        if (c17688e.f34655e > 0) {
            AbstractC4306e.ad(this, c17677e2, null, 1);
        }
    }

    @Override // defpackage.C11325e
    public final void subs() {
        this.f34662e.pro();
        this.f34654e = 0;
        this.f34666e = 0;
        this.f34670e.clear();
        super.subs();
    }

    /* renamed from: super, reason: not valid java name */
    public final boolean m4384super(int i) {
        return (this.f34651e & i) == i;
    }
}
