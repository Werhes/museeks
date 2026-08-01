package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.textclassifier.TextClassification;
import androidx.car.app.navigation.model.Maneuver;
import java.util.List;
import java.util.regex.Matcher;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.conscrypt.BuildConfig;
import ua.itaysonlab.catalogkit.objects.Catalog2ReplacementOption;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkapi2.objects.music.playlist.metadata.MainArtist;
import ua.itaysonlab.vkapi2.objects.users.VKProfile;
import ua.itaysonlab.vkxreborn.cache.realm.CachedPlaylist;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘَۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C5565e implements Function0 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Object f11909e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Object f11910e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f11911e;

    public /* synthetic */ C5565e(C2809e c2809e, C9363e c9363e, C1774e c1774e) {
        this.f11911e = 28;
        this.f11910e = c9363e;
        this.f11909e = c1774e;
    }

    public /* synthetic */ C5565e(Object obj, Object obj2, int i) {
        this.f11911e = i;
        this.f11910e = obj;
        this.f11909e = obj2;
    }

    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.jvm.functions.Function0] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        long purchase;
        long j;
        long j2;
        C0866e license;
        C7911e c7911e;
        C10566e c10566e;
        C18070e c18070e;
        int i = this.f11911e;
        int i2 = 29;
        InterfaceC5083e interfaceC5083e = null;
        int i3 = 2;
        int i4 = 0;
        ?? r12 = this.f11909e;
        Object obj = this.f11910e;
        switch (i) {
            case 0:
                ((C13642e) obj).m2514goto(new C5421e(((AudioTrack) r12).metrica));
                return Unit.INSTANCE;
            case 1:
                ((C10381e) obj).f20513e = (Function2) r12;
                return Unit.INSTANCE;
            case 2:
                return AbstractC2745e.metrica((Context) obj, ((C11354e) r12).ad.concat(".preferences_pb"));
            case 3:
                ((Function1) obj).invoke((C7460e) ((C10629e) r12).f20952e);
                return Unit.INSTANCE;
            case 4:
                C12618e c12618e = (C12618e) obj;
                C17489e c17489e = (C17489e) r12;
                Object[] objArr = c12618e.vip;
                long[] jArr = c12618e.ad;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i5 = 0;
                    while (true) {
                        long j3 = jArr[i5];
                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i6 = 8 - ((~(i5 - length)) >>> 31);
                            for (int i7 = 0; i7 < i6; i7++) {
                                if ((255 & j3) < 128) {
                                    c17489e.applovin(objArr[(i5 << 3) + i7]);
                                }
                                j3 >>= 8;
                            }
                            if (i6 != 8) {
                            }
                        }
                        if (i5 != length) {
                            i5++;
                        }
                    }
                }
                return Unit.INSTANCE;
            case 5:
                CharSequence charSequence = (CharSequence) r12;
                Matcher matcher = ((C10445e) obj).f20638e.matcher(charSequence);
                if (matcher.find(0)) {
                    return new C14031e(matcher, charSequence);
                }
                return null;
            case 6:
                C2347e c2347e = (C2347e) obj;
                AbstractC5336e.purchase(AbstractC4608e.metrica(c2347e.vip()), null, 0, new C7914e(c2347e, ((C2644e) r12).ad, (InterfaceC5083e) null), 3);
                return Unit.INSTANCE;
            case 7:
                return AbstractC10003e.license((String) obj, C13234e.purchase, new InterfaceC9998e[0], new C11848e((C0604e) r12, i4));
            case 8:
                C9456e c9456e = (C9456e) r12;
                int ordinal = ((EnumC12199e) obj).ordinal();
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        c9456e.appmetrica.invoke();
                    } else {
                        if (ordinal != 2) {
                            throw new C14803e(10);
                        }
                        c9456e.amazon.setValue(BuildConfig.FLAVOR);
                        c9456e.purchase.invoke();
                        c9456e.admob(true);
                    }
                }
                return Unit.INSTANCE;
            case 9:
                ((C13867e) obj).vip.invoke(Long.valueOf(((C6475e) r12).ad));
                return Unit.INSTANCE;
            case 10:
                C4034e c4034e = (C4034e) obj;
                long j4 = ((C12729e) ((InterfaceC3314e) r12).getValue()).ad;
                C9106e purchase2 = c4034e.purchase();
                if (purchase2 != null) {
                    EnumC12813e appmetrica = c4034e.appmetrica();
                    int i8 = appmetrica == null ? -1 : AbstractC6109e.ad[appmetrica.ordinal()];
                    if (i8 != -1) {
                        if (i8 == 1) {
                            purchase = AbstractC14520e.purchase(c4034e, j4, purchase2.ad);
                        } else {
                            if (i8 != 2) {
                                if (i8 != 3) {
                                    throw new C14803e(10);
                                }
                                throw new IllegalStateException("SelectionContainer does not support cursor");
                            }
                            purchase = AbstractC14520e.purchase(c4034e, j4, purchase2.vip);
                        }
                        return new C2152e(purchase);
                    }
                }
                purchase = 9205357640488583168L;
                return new C2152e(purchase);
            case 11:
                ((AbstractC15638e) obj).m2514goto((AbstractC13859e) ((Function0) r12).invoke());
                return Unit.INSTANCE;
            case 12:
                ((AbstractC15638e) obj).m2514goto((AbstractC13859e) r12.invoke());
                return Unit.INSTANCE;
            case 13:
                ((C5299e) obj).m2514goto((AbstractC13859e) ((C8779e) r12).invoke());
                return Unit.INSTANCE;
            case 14:
                C3229e c3229e = (C3229e) obj;
                InterfaceC18435e interfaceC18435e = (InterfaceC18435e) r12;
                if (((Boolean) c3229e.license.invoke(EnumC8613e.f17427e)).booleanValue()) {
                    AbstractC5336e.purchase(interfaceC18435e, null, 0, new C13959e(c3229e, interfaceC5083e, 9), 3);
                }
                return Boolean.TRUE;
            case 15:
                CachedPlaylist cachedPlaylist = (CachedPlaylist) r12;
                ((C10797e) obj).m2514goto(new C14873e(cachedPlaylist.metrica(), new VKProfile(cachedPlaylist.pro(), null, null, null, cachedPlaylist.inmobi(), null, null, 110)));
                return Unit.INSTANCE;
            case 16:
                C18362e c18362e = (C18362e) obj;
                C17778e c17778e = (C17778e) r12;
                if (!AbstractC7890e.billing(c18362e, c17778e.ad)) {
                    AbstractC13480e.m3593new(c17778e.vip, new C13749e(i2, c18362e));
                    C2846e c2846e = c17778e.metrica;
                    if (c2846e != null) {
                        c2846e.vip();
                    }
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                ((C1374e) obj).pro().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://vk.com/id" + ((C11590e) r12).f23283e)));
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                ((Function1) obj).invoke((C2357e) r12);
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                C16869e c16869e = (C16869e) obj;
                if (((Boolean) ((InterfaceC16132e) r12).getValue()).booleanValue()) {
                    c16869e.m2514goto(new AbstractC10347e(0));
                } else {
                    new C9745e().signatures(c16869e.pro());
                }
                return Unit.INSTANCE;
            case 20:
                Catalog2ReplacementOption catalog2ReplacementOption = (Catalog2ReplacementOption) obj;
                Function1 function1 = (Function1) r12;
                Integer num = catalog2ReplacementOption.license;
                if (num == null || num.intValue() != 1) {
                    function1.invoke(catalog2ReplacementOption);
                }
                return Unit.INSTANCE;
            case 21:
                C14326e c14326e = AbstractC4475e.ad;
                return Boolean.valueOf(AbstractC4475e.ad(((C14132e) obj).ad, (List) r12));
            case 22:
                return new C13440e((EnumC3856e) obj, (Function1) r12);
            case 23:
                return new C2628e((EnumC11762e) obj, (Function1) r12);
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                AbstractC11815e.m3275while((Context) obj, (TextClassification) r12);
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                C9755e c9755e = (C9755e) obj;
                C3967e c3967e = (C3967e) r12;
                c9755e.f19302e.license();
                if (c9755e.f27016e && ((C1692e) ((InterfaceC3075e) AbstractC10432e.vip(c9755e, AbstractC11473e.signatures))).vip()) {
                    i3 = 1;
                }
                int i9 = c3967e.f8852e;
                int i10 = i3 * i9;
                c3967e.f8852e = i9 * (-1);
                return Integer.valueOf(i10);
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                C1902e c1902e = (C1902e) r12;
                if (!((C7765e) obj).license) {
                    C15108e c15108e = c1902e.f5076e;
                    if (c15108e.f27016e) {
                        c15108e.f29889e.m3237e(7);
                    }
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                C15860e c15860e = (C15860e) obj;
                long j5 = ((C12729e) ((InterfaceC3314e) r12).getValue()).ad;
                C2152e startapp = c15860e.startapp();
                if (startapp != null) {
                    long j6 = startapp.ad;
                    C10566e smaato = c15860e.smaato();
                    if (smaato != null && smaato.f20850e.length() != 0) {
                        EnumC12813e enumC12813e = (EnumC12813e) c15860e.admob.getValue();
                        int i11 = enumC12813e == null ? -1 : AbstractC4975e.ad[enumC12813e.ordinal()];
                        if (i11 != -1) {
                            if (i11 == 1 || i11 == 2) {
                                long j7 = c15860e.amazon().vip;
                                int i12 = C12347e.metrica;
                                j2 = j7 >> 32;
                            } else {
                                if (i11 != 3) {
                                    throw new C14803e(10);
                                }
                                long j8 = c15860e.amazon().vip;
                                int i13 = C12347e.metrica;
                                j2 = j8 & 4294967295L;
                            }
                            int i14 = (int) j2;
                            C7911e c7911e2 = c15860e.license;
                            if (c7911e2 != null && (license = c7911e2.license()) != null && (c7911e = c15860e.license) != null && (c10566e = c7911e.ad.ad) != null) {
                                int metrica = AbstractC3062e.metrica(c15860e.vip.billing(i14), 0, c10566e.f20850e.length());
                                float intBitsToFloat = Float.intBitsToFloat((int) (license.license(j6) >> 32));
                                C12476e c12476e = license.ad;
                                C12890e c12890e = c12476e.vip;
                                int license2 = c12890e.license(metrica);
                                float billing = c12476e.billing(license2);
                                float yandex = c12476e.yandex(license2);
                                float vip = AbstractC3062e.vip(intBitsToFloat, Math.min(billing, yandex), Math.max(billing, yandex));
                                if (C12729e.vip(j5, 0L) || Math.abs(intBitsToFloat - vip) <= ((int) (j5 >> 32)) / 2) {
                                    float purchase3 = c12890e.purchase(license2);
                                    j = (Float.floatToRawIntBits(vip) << 32) | (Float.floatToRawIntBits(((c12890e.vip(license2) - purchase3) / 2) + purchase3) & 4294967295L);
                                    return new C2152e(j);
                                }
                            }
                        }
                    }
                }
                j = 9205357640488583168L;
                return new C2152e(j);
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                C1774e c1774e = (C1774e) r12;
                AbstractC9606e abstractC9606e = (AbstractC9606e) ((C9363e) obj).ad;
                if (abstractC9606e instanceof C1611e) {
                    C18070e c18070e2 = ((C1611e) abstractC9606e).metrica;
                    if (c18070e2 != null) {
                        ((C13553e) c18070e2.f35442e).invoke((MainArtist) c18070e2.f35441e);
                    } else {
                        try {
                            c1774e.ad(((C1611e) abstractC9606e).ad);
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                } else if ((abstractC9606e instanceof C5320e) && (c18070e = ((C5320e) abstractC9606e).metrica) != null) {
                    ((C13553e) c18070e.f35442e).invoke((MainArtist) c18070e.f35441e);
                }
                return Unit.INSTANCE;
            default:
                AbstractC5336e.purchase((InterfaceC18435e) obj, null, 0, new C7236e((C13622e) r12, interfaceC5083e, i2), 3);
                return Unit.INSTANCE;
        }
    }
}
