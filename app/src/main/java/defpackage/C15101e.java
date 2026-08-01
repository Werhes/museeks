package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkx.VKXApplication;
import ua.itaysonlab.vkx.activity.AppActivity;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔۦٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C15101e extends C7460e implements Function0 {

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ int f29884e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15101e(int i, Object obj, Class cls, String str, String str2, int i2, int i3, int i4) {
        super(i, obj, cls, str, str2, i2, i3);
        this.f29884e = i4;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        C14742e c14742e;
        int i;
        boolean m3237e;
        switch (this.f29884e) {
            case 0:
                C0267e c0267e = (C0267e) this.f7266e;
                c0267e.getClass();
                c0267e.m2514goto(new C12785e(true));
                return Unit.INSTANCE;
            case 1:
                ((C1922e) this.f7266e).mo734case();
                return Unit.INSTANCE;
            case 2:
                ((C5838e) this.f7266e).mo734case();
                return Unit.INSTANCE;
            case 3:
                ((C4921e) this.f7266e).mo734case();
                return Unit.INSTANCE;
            case 4:
                ((C16161e) this.f7266e).mo734case();
                return Unit.INSTANCE;
            case 5:
                ((C17399e) this.f7266e).mo734case();
                return Unit.INSTANCE;
            case 6:
                C10992e c10992e = (C10992e) this.f7266e;
                C12618e c12618e = c10992e.metrica;
                C12618e c12618e2 = c10992e.license;
                C8212e c8212e = c10992e.ad;
                C11795e purchase = c8212e.purchase();
                EnumC16488e enumC16488e = EnumC16488e.f32315e;
                if (purchase == null) {
                    Object[] objArr = c12618e2.vip;
                    long[] jArr = c12618e2.ad;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i2 = 0;
                        while (true) {
                            long j = jArr[i2];
                            int i3 = 8;
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i4 = 8 - ((~(i2 - length)) >>> 31);
                                int i5 = 0;
                                while (i5 < i4) {
                                    if ((j & 255) < 128) {
                                        i = i3;
                                        ((InterfaceC13046e) objArr[(i2 << 3) + i5]).mo1035throw(enumC16488e);
                                    } else {
                                        i = i3;
                                    }
                                    j >>= i;
                                    i5++;
                                    i3 = i;
                                }
                                if (i4 != i3) {
                                }
                            }
                            if (i2 != length) {
                                i2++;
                            }
                        }
                    }
                } else if (purchase.f27016e) {
                    if (c12618e.metrica(purchase)) {
                        purchase.m3241e();
                    }
                    EnumC16488e m3239e = purchase.m3239e();
                    if (!purchase.f27022e.f27016e) {
                        AbstractC14070e.metrica("visitAncestors called on an unattached node");
                    }
                    AbstractC13616e abstractC13616e = purchase.f27022e;
                    C13915e mopub = AbstractC5851e.mopub(purchase);
                    int i6 = 0;
                    while (mopub != null) {
                        if ((((AbstractC13616e) mopub.f27592e.billing).f27020e & 5120) != 0) {
                            while (abstractC13616e != null) {
                                int i7 = abstractC13616e.f27014e;
                                if ((i7 & 5120) != 0) {
                                    if ((i7 & 1024) != 0) {
                                        i6++;
                                    }
                                    if ((abstractC13616e instanceof InterfaceC13046e) && c12618e2.metrica(abstractC13616e)) {
                                        if (i6 <= 1) {
                                            ((InterfaceC13046e) abstractC13616e).mo1035throw(m3239e);
                                        } else {
                                            ((InterfaceC13046e) abstractC13616e).mo1035throw(EnumC16488e.f32314e);
                                        }
                                        c12618e2.smaato(abstractC13616e);
                                    }
                                }
                                abstractC13616e = abstractC13616e.f27011e;
                            }
                        }
                        mopub = mopub.tapsense();
                        abstractC13616e = (mopub == null || (c14742e = mopub.f27592e) == null) ? null : (C9011e) c14742e.purchase;
                    }
                    Object[] objArr2 = c12618e2.vip;
                    long[] jArr2 = c12618e2.ad;
                    int length2 = jArr2.length - 2;
                    if (length2 >= 0) {
                        int i8 = 0;
                        while (true) {
                            long j2 = jArr2[i8];
                            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i9 = 8 - ((~(i8 - length2)) >>> 31);
                                for (int i10 = 0; i10 < i9; i10++) {
                                    if ((j2 & 255) < 128) {
                                        ((InterfaceC13046e) objArr2[(i8 << 3) + i10]).mo1035throw(enumC16488e);
                                    }
                                    j2 >>= 8;
                                }
                                if (i9 != 8) {
                                }
                            }
                            if (i8 != length2) {
                                i8++;
                            }
                        }
                    }
                }
                if (c8212e.purchase() == null || c8212e.metrica.m3239e() == enumC16488e) {
                    c8212e.metrica();
                }
                c12618e.vip();
                c12618e2.vip();
                c10992e.appmetrica = false;
                return Unit.INSTANCE;
            case 7:
                m3237e = ((C15108e) this.f7266e).f29889e.m3237e(7);
                return Boolean.valueOf(m3237e);
            case 8:
                ((InterfaceC5673e) this.f7266e).purchase();
                return Unit.INSTANCE;
            case 9:
                ((C15074e) this.f7266e).m3916e();
                return Unit.INSTANCE;
            case 10:
                ((C10117e) this.f7266e).purchase();
                return Unit.INSTANCE;
            case 11:
                ((C8606e) this.f7266e).mo734case();
                return Unit.INSTANCE;
            case 12:
                C8004e c8004e = (C8004e) this.f7266e;
                c8004e.getClass();
                new C2347e(1, new C8233e(c8004e, 1)).signatures(c8004e.pro());
                return Unit.INSTANCE;
            case 13:
                C8004e c8004e2 = (C8004e) this.f7266e;
                c8004e2.getClass();
                new C2347e(1, new C8233e(c8004e2, 1)).signatures(c8004e2.pro());
                return Unit.INSTANCE;
            case 14:
                ((C14748e) this.f7266e).mo734case();
                return Unit.INSTANCE;
            case 15:
                ((C1011e) this.f7266e).mo734case();
                return Unit.INSTANCE;
            case 16:
                C1011e c1011e = (C1011e) this.f7266e;
                c1011e.getClass();
                if (!AbstractC8561e.vip) {
                    throw new RuntimeException("Scrobbler not initialized!");
                }
                AbstractC8561e.ad.edit().remove("username").remove("sessionKey").apply();
                c1011e.f3460e.setValue(null);
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                ((C11379e) this.f7266e).mo734case();
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                ((C5164e) this.f7266e).mo734case();
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                ((C0139e) this.f7266e).getClass();
                C5658e.vip.f36546e.purchase();
                return Unit.INSTANCE;
            case 20:
                ((C0139e) this.f7266e).getClass();
                VKXApplication vKXApplication = VKXApplication.f36528e;
                if (vKXApplication == null) {
                    vKXApplication = null;
                }
                AbstractC6232e.billing(C0874e.ad, vKXApplication);
                return Unit.INSTANCE;
            case 21:
                ((C8054e) this.f7266e).purchase();
                return Unit.INSTANCE;
            case 22:
                ((C8054e) this.f7266e).purchase();
                return Unit.INSTANCE;
            case 23:
                ((C5344e) this.f7266e).mo734case();
                return Unit.INSTANCE;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                C5344e c5344e = (C5344e) this.f7266e;
                if (!((Boolean) c5344e.f11456e.getValue()).booleanValue() && c5344e.m1891private() != EnumC12651e.f25373e && c5344e.m1891private() != EnumC12651e.f25374e) {
                    AbstractC5336e.purchase(c5344e, null, 0, new C2458e(c5344e, null, 1), 3);
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                ((C7897e) this.f7266e).mo734case();
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                AbstractC14297e abstractC14297e = (AbstractC14297e) ((C12329e) this.f7266e).ad.get();
                if (abstractC14297e != null) {
                    abstractC14297e.mo3651e();
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                AppActivity appActivity = (AppActivity) ((C3119e) this.f7266e).pro();
                appActivity.onBackPressed();
                appActivity.f36542e.license(C14411e.f28494e);
                C7947e.ad.getClass();
                C7947e.purchase.applovin(C7947e.vip[1], Boolean.FALSE);
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                AppActivity appActivity2 = (AppActivity) ((C3119e) this.f7266e).pro();
                appActivity2.onBackPressed();
                VKXApplication.f36529e.postDelayed(new RunnableC6297e(appActivity2, 1), 500L);
                return Unit.INSTANCE;
            default:
                AppActivity appActivity3 = (AppActivity) ((C3119e) this.f7266e).pro();
                AbstractC5004e abstractC5004e = (AbstractC5004e) AbstractC13480e.m3604this(appActivity3.f36541e);
                if (abstractC5004e != null) {
                    abstractC5004e.purchase();
                }
                VKXApplication.f36529e.postDelayed(new RunnableC6297e(appActivity3, 2), 500L);
                return Unit.INSTANCE;
        }
    }
}
