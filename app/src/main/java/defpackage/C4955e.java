package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْؗ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4955e extends AbstractC14215e {

    /* renamed from: eَؑۨ, reason: contains not printable characters */
    public int f10475e;

    /* renamed from: eؑۥؘ, reason: contains not printable characters */
    public int f10476e;

    /* renamed from: eؒٚۨ, reason: contains not printable characters */
    public ArrayList f10477e;

    /* renamed from: eٟؒؗ, reason: contains not printable characters */
    public int f10478e;

    /* renamed from: eؒۖۗ, reason: contains not printable characters */
    public int f10479e;

    /* renamed from: eؒۤۨ, reason: contains not printable characters */
    public int f10480e;

    /* renamed from: eؘْؖ, reason: contains not printable characters */
    public int f10481e;

    /* renamed from: eٍؖۙ, reason: contains not printable characters */
    public int f10482e;

    /* renamed from: eٌؖۡ, reason: contains not printable characters */
    public int f10483e;

    /* renamed from: eؘؕۥ, reason: contains not printable characters */
    public int f10484e;

    /* renamed from: eؘُٔ, reason: contains not printable characters */
    public C10039e f10485e;

    /* renamed from: eؘٕۚ, reason: contains not printable characters */
    public float f10486e;

    /* renamed from: eؚؚؓ, reason: contains not printable characters */
    public int f10487e;

    /* renamed from: eؚٜ۠, reason: contains not printable characters */
    public int[] f10488e;

    /* renamed from: eؚۜؑ, reason: contains not printable characters */
    public int f10489e;

    /* renamed from: eٍۢؒ, reason: contains not printable characters */
    public int f10490e;

    /* renamed from: eَٖٓ, reason: contains not printable characters */
    public int f10491e;

    /* renamed from: eُٓؓ, reason: contains not printable characters */
    public int f10492e;

    /* renamed from: eُؚٕ, reason: contains not printable characters */
    public int f10493e;

    /* renamed from: eُۘٙ, reason: contains not printable characters */
    public float f10494e;

    /* renamed from: eِؗؓ, reason: contains not printable characters */
    public int f10495e;

    /* renamed from: eؙِۡ, reason: contains not printable characters */
    public int f10496e;

    /* renamed from: eّّۚ, reason: contains not printable characters */
    public C11325e[] f10497e;

    /* renamed from: eّْٝ, reason: contains not printable characters */
    public float f10498e;

    /* renamed from: eًْٕ, reason: contains not printable characters */
    public C11325e[] f10499e;

    /* renamed from: eْۢؕ, reason: contains not printable characters */
    public int f10500e;

    /* renamed from: eٍٓۢ, reason: contains not printable characters */
    public int f10501e;

    /* renamed from: eٓٛۢ, reason: contains not printable characters */
    public C0724e f10502e;

    /* renamed from: eٌٔٗ, reason: contains not printable characters */
    public int f10503e;

    /* renamed from: eّٔؖ, reason: contains not printable characters */
    public boolean f10504e;

    /* renamed from: eٕؓٝ, reason: contains not printable characters */
    public float f10505e;

    /* renamed from: eٕٙؗ, reason: contains not printable characters */
    public int f10506e;

    /* renamed from: eؘٖؗ, reason: contains not printable characters */
    public float f10507e;

    /* renamed from: eٖٔۧ, reason: contains not printable characters */
    public C11325e[] f10508e;

    /* renamed from: eٟٗۦ, reason: contains not printable characters */
    public int f10509e;

    /* renamed from: e٘ٔ٘, reason: contains not printable characters */
    public float f10510e;

    /* renamed from: case, reason: not valid java name */
    public final int m1693case(C11325e c11325e, int i) {
        C11325e c11325e2;
        if (c11325e != null) {
            int[] iArr = c11325e.f22751public;
            if (iArr[1] == 3) {
                int i2 = c11325e.remoteconfig;
                if (i2 != 0) {
                    if (i2 == 2) {
                        int i3 = (int) (c11325e.applovin * i);
                        if (i3 != c11325e.mopub()) {
                            c11325e.billing = true;
                            m1695final(iArr[0], c11325e.admob(), 1, i3, c11325e);
                        }
                        return i3;
                    }
                    c11325e2 = c11325e;
                    if (i2 == 1) {
                        return c11325e2.mopub();
                    }
                    if (i2 == 3) {
                        return (int) ((c11325e2.admob() * c11325e2.f22755super) + 0.5f);
                    }
                }
            } else {
                c11325e2 = c11325e;
            }
            return c11325e2.mopub();
        }
        return 0;
    }

    /* renamed from: catch, reason: not valid java name */
    public final int m1694catch(C11325e c11325e, int i) {
        C11325e c11325e2;
        if (c11325e != null) {
            int[] iArr = c11325e.f22751public;
            if (iArr[0] == 3) {
                int i2 = c11325e.subscription;
                if (i2 != 0) {
                    if (i2 == 2) {
                        int i3 = (int) (c11325e.isVip * i);
                        if (i3 != c11325e.admob()) {
                            c11325e.billing = true;
                            m1695final(1, i3, iArr[1], c11325e.mopub(), c11325e);
                        }
                        return i3;
                    }
                    c11325e2 = c11325e;
                    if (i2 == 1) {
                        return c11325e2.admob();
                    }
                    if (i2 == 3) {
                        return (int) ((c11325e2.mopub() * c11325e2.f22755super) + 0.5f);
                    }
                }
            } else {
                c11325e2 = c11325e;
            }
            return c11325e2.admob();
        }
        return 0;
    }

    /* renamed from: final, reason: not valid java name */
    public final void m1695final(int i, int i2, int i3, int i4, C11325e c11325e) {
        C0724e c0724e;
        C11325e c11325e2;
        C10039e c10039e = this.f10485e;
        while (true) {
            c0724e = this.f10502e;
            if (c0724e != null || (c11325e2 = this.f22730case) == null) {
                break;
            } else {
                this.f10502e = ((C17688e) c11325e2).f34649e;
            }
        }
        c10039e.ad = i;
        c10039e.vip = i3;
        c10039e.metrica = i2;
        c10039e.license = i4;
        c0724e.vip(c11325e, c10039e);
        c11325e.m3195protected(c10039e.appmetrica);
        c11325e.m3197throw(c10039e.purchase);
        c11325e.firebase = c10039e.yandex;
        c11325e.m3196this(c10039e.billing);
    }

    @Override // defpackage.AbstractC14215e
    /* renamed from: implements, reason: not valid java name */
    public final void mo1696implements() {
        for (int i = 0; i < this.f28080e; i++) {
            C11325e c11325e = this.f28081e[i];
            if (c11325e != null) {
                c11325e.f22732class = true;
            }
        }
    }

    @Override // defpackage.C11325e
    public final void vip(C17677e c17677e, boolean z) {
        C11325e c11325e;
        float f;
        int i;
        ArrayList arrayList = this.f10477e;
        super.vip(c17677e, z);
        C11325e c11325e2 = this.f22730case;
        boolean z2 = c11325e2 != null && ((C17688e) c11325e2).f34653e;
        int i2 = this.f10500e;
        if (i2 != 0) {
            if (i2 == 1) {
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    ((C15461e) arrayList.get(i3)).vip(i3, z2, i3 == size + (-1));
                    i3++;
                }
            } else if (i2 != 2) {
                if (i2 == 3) {
                    int size2 = arrayList.size();
                    int i4 = 0;
                    while (i4 < size2) {
                        ((C15461e) arrayList.get(i4)).vip(i4, z2, i4 == size2 + (-1));
                        i4++;
                    }
                }
            } else if (this.f10488e != null && this.f10508e != null && this.f10497e != null) {
                for (int i5 = 0; i5 < this.f10506e; i5++) {
                    this.f10499e[i5].crashlytics();
                }
                int[] iArr = this.f10488e;
                int i6 = iArr[0];
                int i7 = iArr[1];
                float f2 = this.f10505e;
                C11325e c11325e3 = null;
                int i8 = 0;
                while (i8 < i6) {
                    if (z2) {
                        i = (i6 - i8) - 1;
                        f = 1.0f - this.f10505e;
                    } else {
                        f = f2;
                        i = i8;
                    }
                    C11325e c11325e4 = this.f10508e[i];
                    if (c11325e4 != null) {
                        C9399e c9399e = c11325e4.f22758this;
                        if (c11325e4.f22752return != 8) {
                            if (i8 == 0) {
                                c11325e4.purchase(c9399e, this.f22758this, this.f10492e);
                                c11325e4.f22756switch = this.f10479e;
                                c11325e4.f22744instanceof = f;
                            }
                            if (i8 == i6 - 1) {
                                c11325e4.purchase(c11325e4.f22737extends, this.f22737extends, this.f10483e);
                            }
                            if (i8 > 0 && c11325e3 != null) {
                                C9399e c9399e2 = c11325e3.f22737extends;
                                c11325e4.purchase(c9399e, c9399e2, this.f10475e);
                                c11325e3.purchase(c9399e2, c9399e, 0);
                            }
                            c11325e3 = c11325e4;
                        }
                    }
                    i8++;
                    f2 = f;
                }
                for (int i9 = 0; i9 < i7; i9++) {
                    C11325e c11325e5 = this.f10497e[i9];
                    if (c11325e5 != null) {
                        C9399e c9399e3 = c11325e5.f22746native;
                        if (c11325e5.f22752return != 8) {
                            if (i9 == 0) {
                                c11325e5.purchase(c9399e3, this.f22746native, this.f10493e);
                                c11325e5.f22760throws = this.f10495e;
                                c11325e5.f22753static = this.f10486e;
                            }
                            if (i9 == i7 - 1) {
                                c11325e5.purchase(c11325e5.f22759throw, this.f22759throw, this.f10480e);
                            }
                            if (i9 > 0 && c11325e3 != null) {
                                C9399e c9399e4 = c11325e3.f22759throw;
                                c11325e5.purchase(c9399e3, c9399e4, this.f10490e);
                                c11325e3.purchase(c9399e4, c9399e3, 0);
                            }
                            c11325e3 = c11325e5;
                        }
                    }
                }
                for (int i10 = 0; i10 < i6; i10++) {
                    for (int i11 = 0; i11 < i7; i11++) {
                        int i12 = (i11 * i6) + i10;
                        if (this.f10503e == 1) {
                            i12 = (i10 * i7) + i11;
                        }
                        C11325e[] c11325eArr = this.f10499e;
                        if (i12 < c11325eArr.length && (c11325e = c11325eArr[i12]) != null && c11325e.f22752return != 8) {
                            C11325e c11325e6 = this.f10508e[i10];
                            C11325e c11325e7 = this.f10497e[i11];
                            if (c11325e != c11325e6) {
                                c11325e.purchase(c11325e.f22758this, c11325e6.f22758this, 0);
                                c11325e.purchase(c11325e.f22737extends, c11325e6.f22737extends, 0);
                            }
                            if (c11325e != c11325e7) {
                                c11325e.purchase(c11325e.f22746native, c11325e7.f22746native, 0);
                                c11325e.purchase(c11325e.f22759throw, c11325e7.f22759throw, 0);
                            }
                        }
                    }
                }
            }
        } else if (arrayList.size() > 0) {
            ((C15461e) arrayList.get(0)).vip(0, z2, true);
        }
        this.f10504e = false;
    }
}
