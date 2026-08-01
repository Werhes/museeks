package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.HashMap;

/* renamed from: eّؒؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1010e {
    public static final HashMap ad;

    static {
        HashMap hashMap = new HashMap();
        ad = hashMap;
        hashMap.put(InterfaceC3408e.ad, new C2222e(18));
        hashMap.put(InterfaceC3408e.vip, new C2222e(10));
        hashMap.put(InterfaceC3408e.metrica, new C2222e(21));
        hashMap.put(InterfaceC3408e.license, new C2222e(22));
        hashMap.put(InterfaceC15572e.ad, new C2222e(21));
        hashMap.put(InterfaceC15572e.vip, new C2222e(22));
        hashMap.put(InterfaceC5051e.f10810e, new C2222e(6));
        AbstractC1634e.pro(hashMap, InterfaceC18291e.adcel);
        AbstractC1634e.pro(hashMap, InterfaceC18291e.mopub);
        AbstractC1634e.pro(hashMap, InterfaceC18291e.advert);
        AbstractC1634e.pro(hashMap, InterfaceC18291e.smaato);
        AbstractC1634e.pro(hashMap, InterfaceC18291e.amazon);
        AbstractC1634e.pro(hashMap, InterfaceC18291e.loadAd);
        AbstractC1634e.pro(hashMap, InterfaceC18291e.Signature);
        AbstractC1634e.pro(hashMap, InterfaceC18291e.admob);
        AbstractC1634e.pro(hashMap, InterfaceC18291e.subscription);
        AbstractC1634e.pro(hashMap, InterfaceC18291e.remoteconfig);
        AbstractC1634e.pro(hashMap, InterfaceC18291e.pro);
        AbstractC1634e.pro(hashMap, InterfaceC18291e.signatures);
        AbstractC1634e.pro(hashMap, InterfaceC18291e.tapsense);
        AbstractC1634e.pro(hashMap, InterfaceC18291e.isVip);
        AbstractC1634e.pro(hashMap, InterfaceC18291e.inmobi);
        AbstractC1634e.pro(hashMap, InterfaceC18291e.isPro);
        AbstractC1634e.pro(hashMap, InterfaceC18291e.applovin);
        AbstractC1634e.pro(hashMap, InterfaceC18291e.ads);
        AbstractC1634e.pro(hashMap, InterfaceC18291e.premium);
        AbstractC1634e.pro(hashMap, InterfaceC18291e.f35921interface);
        AbstractC1634e.pro(hashMap, InterfaceC18291e.f35917goto);
        AbstractC1634e.pro(hashMap, InterfaceC18291e.f35940while);
        AbstractC1634e.pro(hashMap, InterfaceC18291e.f35938try);
        AbstractC1634e.pro(hashMap, InterfaceC18291e.f35918implements);
        AbstractC1634e.pro(hashMap, InterfaceC18291e.f35761case);
        AbstractC1634e.pro(hashMap, InterfaceC18291e.f35931super);
        AbstractC1634e.pro(hashMap, InterfaceC18291e.f35914final);
        AbstractC1634e.pro(hashMap, InterfaceC18291e.f35919import);
        AbstractC1634e.pro(hashMap, InterfaceC18291e.f35937transient);
        AbstractC1634e.pro(hashMap, InterfaceC18291e.f35930strictfp);
        AbstractC1634e.pro(hashMap, InterfaceC18291e.f35923new);
        AbstractC1634e.pro(hashMap, InterfaceC18291e.f35929static);
        AbstractC1634e.pro(hashMap, InterfaceC18291e.f35920instanceof);
        AbstractC1634e.pro(hashMap, InterfaceC18291e.f35924package);
        AbstractC1634e.pro(hashMap, InterfaceC18291e.f35925private);
        AbstractC1634e.pro(hashMap, InterfaceC18291e.f35928return);
        hashMap.put(InterfaceC18291e.f35933synchronized, new C2222e(19));
        AbstractC1634e.pro(hashMap, new Ctry("1.3.9999.6.4.10"));
        int i = 1;
        hashMap.put(InterfaceC18291e.f35868e, new C2222e(i));
        hashMap.put(InterfaceC18291e.f35855e, new C2222e(i));
        hashMap.put(InterfaceC18291e.f35865e, new C2222e(i));
        hashMap.put(InterfaceC18291e.f35801e, new C2222e(i));
        hashMap.put(InterfaceC18291e.f35873e, new C2222e(i));
        hashMap.put(InterfaceC18291e.f35781e, new C2222e(i));
        hashMap.put(InterfaceC18291e.f35858e, new C2222e(i));
        hashMap.put(InterfaceC18291e.f35891e, new C2222e(i));
        hashMap.put(InterfaceC18291e.f35825e, new C2222e(i));
        hashMap.put(InterfaceC18291e.f35863e, new C2222e(i));
        int i2 = 4;
        hashMap.put(InterfaceC18291e.f35835e, new C2222e(i2));
        hashMap.put(InterfaceC18291e.f35838e, new C2222e(i2));
        hashMap.put(InterfaceC18291e.f35872e, new C2222e(i2));
        hashMap.put(InterfaceC18291e.f35797e, new C2222e(i2));
        hashMap.put(InterfaceC18291e.f35834e, new C2222e(i2));
        hashMap.put(InterfaceC18291e.f35820e, new C2222e(i2));
        int i3 = 15;
        hashMap.put(InterfaceC18291e.f35912e, new C2222e(i3));
        hashMap.put(InterfaceC18291e.f35897e, new C2222e(i3));
        hashMap.put(InterfaceC18291e.f35780e, new C2222e(i3));
        hashMap.put(InterfaceC18291e.f35875e, new C2222e(i3));
        hashMap.put(InterfaceC18291e.f35819e, new C2222e(i3));
        hashMap.put(InterfaceC18291e.f35774e, new C2222e(i3));
        hashMap.put(InterfaceC18291e.f35837e, new C2222e(i3));
        hashMap.put(InterfaceC18291e.f35860e, new C2222e(i3));
        hashMap.put(InterfaceC18291e.f35864e, new C2222e(i3));
        hashMap.put(InterfaceC18291e.f35878e, new C2222e(i3));
        hashMap.put(InterfaceC18291e.f35822e, new C2222e(i3));
        hashMap.put(InterfaceC18291e.f35866e, new C2222e(i3));
        hashMap.put(InterfaceC18291e.f35830e, new C2222e(i3));
        hashMap.put(InterfaceC18291e.f35870e, new C2222e(i3));
        hashMap.put(InterfaceC18291e.f35802e, new C2222e(i3));
        hashMap.put(InterfaceC18291e.f35850e, new C2222e(i3));
        hashMap.put(InterfaceC18291e.f35906e, new C2222e(i3));
        hashMap.put(InterfaceC18291e.f35816e, new C2222e(i3));
        int i4 = 13;
        hashMap.put(InterfaceC18291e.f35936throws, new C2222e(i4));
        hashMap.put(InterfaceC18291e.f35915finally, new C2222e(i4));
        hashMap.put(InterfaceC18291e.f35764const, new C2222e(i4));
        hashMap.put(InterfaceC18291e.f35939volatile, new C2222e(i4));
        hashMap.put(InterfaceC18291e.f35916for, new C2222e(i4));
        hashMap.put(InterfaceC18291e.f35765continue, new C2222e(i4));
        hashMap.put(InterfaceC18291e.f35927public, new C2222e(i4));
        hashMap.put(InterfaceC18291e.f35907e, new C2222e(i4));
        hashMap.put(InterfaceC18291e.f35829e, new C2222e(i4));
        hashMap.put(InterfaceC18291e.f35845e, new C2222e(i4));
        hashMap.put(InterfaceC18291e.f35786e, new C2222e(i4));
        hashMap.put(InterfaceC18291e.f35775e, new C2222e(i4));
        int i5 = 12;
        hashMap.put(InterfaceC18291e.f35782e, new C2222e(i5));
        hashMap.put(InterfaceC18291e.f35811e, new C2222e(i5));
        hashMap.put(InterfaceC18291e.f35846e, new C2222e(i5));
        hashMap.put(InterfaceC18291e.f35791e, new C2222e(i5));
        hashMap.put(InterfaceC18291e.f35881e, new C2222e(i5));
        hashMap.put(InterfaceC18291e.f35883e, new C2222e(i5));
        int i6 = 3;
        hashMap.put(InterfaceC18291e.f35874e, new C2222e(i6));
        hashMap.put(InterfaceC18291e.f35899e, new C2222e(i6));
        hashMap.put(InterfaceC18291e.f35844e, new C2222e(i6));
        hashMap.put(InterfaceC18291e.f35803e, new C2222e(i6));
        int i7 = 8;
        hashMap.put(InterfaceC0760e.f3085e, new C2222e(i7));
        hashMap.put(InterfaceC0760e.f3062e, new C2222e(i7));
        hashMap.put(InterfaceC0760e.f3075e, new C2222e(i7));
        hashMap.put(InterfaceC18291e.f35853e, new C2222e(i7));
        hashMap.put(InterfaceC18291e.f35799e, new C2222e(i7));
        hashMap.put(InterfaceC18291e.f35877e, new C2222e(i7));
        int i8 = 11;
        hashMap.put(InterfaceC18291e.f35809e, new C2222e(i8));
        hashMap.put(InterfaceC18291e.f35888e, new C2222e(i8));
        hashMap.put(InterfaceC18291e.f35818e, new C2222e(i8));
        hashMap.put(InterfaceC18291e.f35854e, new C2222e(i8));
        hashMap.put(InterfaceC18291e.f35817e, new C2222e(i8));
        hashMap.put(InterfaceC18291e.f35773e, new C2222e(i8));
        int i9 = 17;
        hashMap.put(InterfaceC18291e.f35896e, new C2222e(i9));
        hashMap.put(InterfaceC18291e.f35903e, new C2222e(i9));
        hashMap.put(InterfaceC18291e.f35789e, new C2222e(i9));
        hashMap.put(InterfaceC18291e.f35808e, new C2222e(i9));
        hashMap.put(InterfaceC18291e.f35806e, new C2222e(i9));
        hashMap.put(InterfaceC18291e.f35908e, new C2222e(i9));
        int i10 = 7;
        hashMap.put(InterfaceC0760e.f3090finally, new C2222e(i10));
        hashMap.put(InterfaceC0760e.f3057const, new C2222e(i10));
        hashMap.put(InterfaceC0760e.f3114volatile, new C2222e(i10));
        hashMap.put(InterfaceC0760e.f3091for, new C2222e(i10));
        hashMap.put(InterfaceC0760e.f3058continue, new C2222e(i10));
        hashMap.put(InterfaceC0760e.f3102public, new C2222e(i10));
        int i11 = 2;
        hashMap.put(InterfaceC18291e.f35812e, new C2222e(i11));
        hashMap.put(InterfaceC18291e.f35871e, new C2222e(i11));
        hashMap.put(InterfaceC18291e.f35784e, new C2222e(i11));
        hashMap.put(InterfaceC18291e.f35851e, new C2222e(i11));
        hashMap.put(InterfaceC18291e.f35826e, new C2222e(i11));
        hashMap.put(InterfaceC18291e.f35843e, new C2222e(i11));
        int i12 = 0;
        hashMap.put(InterfaceC18291e.f35876e, new C2222e(i12));
        hashMap.put(InterfaceC18291e.f35887e, new C2222e(i12));
        hashMap.put(InterfaceC18291e.f35900e, new C2222e(i12));
        int i13 = 5;
        hashMap.put(InterfaceC18291e.f35836e, new C2222e(i13));
        hashMap.put(InterfaceC18291e.f35857e, new C2222e(i13));
        hashMap.put(InterfaceC18291e.f35798e, new C2222e(i13));
        int i14 = 14;
        hashMap.put(InterfaceC18291e.f35824e, new C2222e(i14));
        hashMap.put(InterfaceC18291e.f35882e, new C2222e(i14));
        hashMap.put(InterfaceC18291e.f35813e, new C2222e(i14));
        hashMap.put(InterfaceC18291e.f35905e, new C2222e(i14));
        hashMap.put(InterfaceC18291e.f35848e, new C2222e(i14));
        hashMap.put(InterfaceC18291e.f35859e, new C2222e(i14));
        AbstractC1634e.admob(hashMap, InterfaceC0760e.f3088e);
        AbstractC1634e.admob(hashMap, InterfaceC0760e.f3074e);
        AbstractC1634e.admob(hashMap, InterfaceC0760e.f3078e);
        AbstractC1634e.admob(hashMap, InterfaceC0760e.f3066e);
        AbstractC1634e.admob(hashMap, InterfaceC0760e.f3063e);
        AbstractC1634e.admob(hashMap, InterfaceC0760e.f3067e);
        AbstractC1634e.admob(hashMap, InterfaceC0760e.f3077e);
        AbstractC1634e.admob(hashMap, InterfaceC0760e.f3068e);
        AbstractC1634e.admob(hashMap, InterfaceC0760e.f3083e);
        AbstractC1634e.admob(hashMap, InterfaceC0760e.f3086e);
        AbstractC1634e.admob(hashMap, InterfaceC0760e.f3069e);
        AbstractC1634e.admob(hashMap, InterfaceC0760e.f3070e);
        AbstractC1634e.admob(hashMap, InterfaceC0760e.f3082e);
        AbstractC1634e.admob(hashMap, InterfaceC0760e.f3065e);
        AbstractC1634e.admob(hashMap, InterfaceC0760e.f3080e);
        AbstractC1634e.admob(hashMap, InterfaceC0760e.f3073e);
        AbstractC1634e.admob(hashMap, InterfaceC0760e.f3076e);
        AbstractC1634e.admob(hashMap, InterfaceC0760e.f3064e);
        AbstractC1634e.admob(hashMap, InterfaceC0760e.f3072e);
        AbstractC1634e.admob(hashMap, InterfaceC0760e.f3084e);
        AbstractC1634e.admob(hashMap, InterfaceC0760e.f3071e);
        AbstractC1634e.admob(hashMap, InterfaceC0760e.f3087e);
        AbstractC1634e.admob(hashMap, InterfaceC0760e.f3079e);
        AbstractC1634e.admob(hashMap, InterfaceC0760e.f3081e);
        int i15 = 9;
        hashMap.put(InterfaceC18291e.f35796e, new C2222e(i15));
        hashMap.put(InterfaceC18291e.f35898e, new C2222e(i15));
        hashMap.put(InterfaceC18291e.f35842e, new C2222e(i15));
        hashMap.put(InterfaceC18291e.f35849e, new C2222e(i15));
        AbstractC1634e.signatures(hashMap, InterfaceC18291e.f35828e);
        AbstractC1634e.signatures(hashMap, InterfaceC18291e.f35805e);
        AbstractC1634e.signatures(hashMap, InterfaceC18291e.f35910e);
        AbstractC1634e.signatures(hashMap, InterfaceC18291e.f35869e);
        AbstractC1634e.signatures(hashMap, InterfaceC18291e.f35778e);
        AbstractC1634e.signatures(hashMap, InterfaceC18291e.f35886e);
        AbstractC1634e.signatures(hashMap, InterfaceC18291e.f35776e);
        AbstractC1634e.signatures(hashMap, InterfaceC18291e.f35777e);
        AbstractC1634e.signatures(hashMap, InterfaceC18291e.f35911e);
        AbstractC1634e.signatures(hashMap, InterfaceC18291e.f35867e);
        AbstractC1634e.signatures(hashMap, InterfaceC18291e.f35794e);
        AbstractC1634e.signatures(hashMap, InterfaceC18291e.f35909e);
        AbstractC1634e.signatures(hashMap, InterfaceC18291e.f35772e);
        AbstractC1634e.signatures(hashMap, InterfaceC18291e.f35895e);
        AbstractC1634e.signatures(hashMap, InterfaceC18291e.f35892e);
        AbstractC1634e.signatures(hashMap, InterfaceC18291e.f35913e);
        AbstractC1634e.signatures(hashMap, InterfaceC18291e.f35771e);
        AbstractC1634e.signatures(hashMap, InterfaceC18291e.f35893e);
        AbstractC1634e.signatures(hashMap, InterfaceC18291e.f35879e);
        AbstractC1634e.signatures(hashMap, InterfaceC18291e.f35787e);
        AbstractC1634e.signatures(hashMap, InterfaceC18291e.f35823e);
        AbstractC1634e.signatures(hashMap, InterfaceC18291e.f35847e);
        AbstractC1634e.signatures(hashMap, InterfaceC18291e.f35832e);
        AbstractC1634e.signatures(hashMap, InterfaceC18291e.f35856e);
        AbstractC1634e.signatures(hashMap, InterfaceC18291e.f35833e);
        AbstractC1634e.signatures(hashMap, InterfaceC18291e.f35839e);
        AbstractC1634e.signatures(hashMap, InterfaceC18291e.f35788e);
        AbstractC1634e.signatures(hashMap, InterfaceC18291e.f35785e);
        AbstractC1634e.signatures(hashMap, InterfaceC18291e.f35862e);
        AbstractC1634e.signatures(hashMap, InterfaceC18291e.f35804e);
        AbstractC1634e.signatures(hashMap, InterfaceC18291e.f35840e);
        AbstractC1634e.signatures(hashMap, InterfaceC18291e.f35902e);
        AbstractC1634e.signatures(hashMap, InterfaceC18291e.f35885e);
        AbstractC1634e.signatures(hashMap, InterfaceC18291e.f35821e);
        AbstractC1634e.signatures(hashMap, InterfaceC18291e.f35790e);
        AbstractC1634e.signatures(hashMap, InterfaceC18291e.f35779e);
        AbstractC1634e.signatures(hashMap, InterfaceC18291e.f35814e);
        AbstractC1634e.signatures(hashMap, InterfaceC18291e.f35890e);
        AbstractC1634e.signatures(hashMap, InterfaceC18291e.f35852e);
        AbstractC1634e.signatures(hashMap, InterfaceC18291e.f35792e);
        AbstractC1634e.signatures(hashMap, InterfaceC18291e.f35901e);
        AbstractC1634e.signatures(hashMap, InterfaceC18291e.f35770e);
        AbstractC1634e.signatures(hashMap, InterfaceC18291e.f35831e);
        AbstractC1634e.signatures(hashMap, InterfaceC18291e.f35894e);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0012. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [eؒٔٚ] */
    /* JADX WARN: Type inference failed for: r1v17, types: [eٍؚؖ] */
    /* JADX WARN: Type inference failed for: r1v23, types: [eٌۙ] */
    /* JADX WARN: Type inference failed for: r1v29, types: [eۨۚ] */
    /* JADX WARN: Type inference failed for: r1v36, types: [eٍۤۥ] */
    /* JADX WARN: Type inference failed for: r1v38, types: [eؒؔۙ, eٖۧؒ] */
    /* JADX WARN: Type inference failed for: r1v41, types: [eٍّؒ] */
    /* JADX WARN: Type inference failed for: r1v43, types: [eّٖٔ] */
    /* JADX WARN: Type inference failed for: r1v45, types: [eَؓٗ] */
    /* JADX WARN: Type inference failed for: r1v5, types: [eًٔۗ] */
    /* JADX WARN: Type inference failed for: r1v50, types: [eَؔٔ] */
    /* JADX WARN: Type inference failed for: r1v52, types: [eَؔٔ] */
    /* JADX WARN: Type inference failed for: r1v57, types: [eؙؚٟ] */
    /* JADX WARN: Type inference failed for: r1v59, types: [eؒؔۙ, eؙؔۧ] */
    /* JADX WARN: Type inference failed for: r1v62, types: [eًۜؔ] */
    /* JADX WARN: Type inference failed for: r1v64, types: [eٌُؚ] */
    /* JADX WARN: Type inference failed for: r1v67 */
    /* JADX WARN: Type inference failed for: r1v69, types: [eٌٓٚ] */
    public static AbstractC9027e ad(C3780e c3780e) {
        AbstractC9027e c14593e;
        AbstractC9027e c14593e2;
        AbstractC9027e ad2;
        if (c3780e == null) {
            throw new IllegalArgumentException("keyInfo argument null");
        }
        C16527e c16527e = c3780e.f8386e;
        C2222e c2222e = (C2222e) ad.get(c16527e.f32408e);
        if (c2222e == null) {
            throw new IOException("algorithm identifier in public key not recognised: " + c16527e.f32408e);
        }
        switch (c2222e.ad) {
            case 0:
                try {
                    c14593e2 = new C14593e((C5539e) AbstractC12348e.premium.get(c3780e.f8386e.f32408e), Cprotected.subs(c3780e.Signature()).f36449e);
                    return c14593e2;
                } catch (Exception unused) {
                    c14593e = new C14593e((C5539e) AbstractC12348e.premium.get(c3780e.f8386e.f32408e), c3780e.f8385e.m4602class());
                    break;
                }
            case 1:
                try {
                    c14593e2 = new C18542e((C16331e) AbstractC12348e.amazon.get(c3780e.f8386e.f32408e), AbstractC12442e.license(C5473e.loadAd(c3780e.Signature()).f11750e));
                    return c14593e2;
                } catch (Exception unused2) {
                    c14593e = new C18542e((C16331e) AbstractC12348e.amazon.get(c3780e.f8386e.f32408e), c3780e.f8385e.m4602class());
                    break;
                }
            case 2:
                return C2222e.ad((C0838e) AbstractC12348e.applovin.get(c3780e.f8386e.f32408e), c3780e.f8385e);
            case 3:
                byte[] m4602class = c3780e.f8385e.m4602class();
                c14593e = new C9884e((C4113e) AbstractC12348e.pro.get(c3780e.f8386e.f32408e), AbstractC12442e.admob(1, m4602class.length, m4602class));
                return c14593e;
            case 4:
                byte[] bArr = Cprotected.subs(c3780e.Signature()).f36449e;
                c14593e = new AbstractC0821e(AbstractC12348e.adcel.get(c3780e.f8386e.f32408e), false);
                c14593e.f32677e = AbstractC12442e.license(bArr);
                return c14593e;
            case 5:
                try {
                    c14593e2 = new C18338e((C7795e) AbstractC12348e.crashlytics.get(c3780e.f8386e.f32408e), Cprotected.subs(c3780e.Signature()).f36449e);
                    return c14593e2;
                } catch (Exception unused3) {
                    c14593e = new C18338e((C7795e) AbstractC12348e.crashlytics.get(c3780e.f8386e.f32408e), c3780e.f8385e.m4602class());
                    break;
                }
            case 6:
                byte[] m4602class2 = c3780e.f8385e.m4602class();
                Cprotected cprotected = (Cprotected) AbstractC12348e.metrica(m4602class2);
                ad2 = cprotected != null ? C3100e.ad(cprotected.f36449e) : C3100e.ad(m4602class2);
                return ad2;
            case 7:
                return C2222e.vip((C3456e) AbstractC12348e.f24768native.get(c3780e.f8386e.f32408e), c3780e.f8385e);
            case 8:
                c14593e = new C0957e((C12532e) AbstractC12348e.f24766goto.get(c3780e.f8386e.f32408e), c3780e.f8385e.m4602class());
                return c14593e;
            case 9:
                c14593e = new C16204e((C10280e) AbstractC12348e.f24772try.get(c3780e.f8386e.f32408e), Cprotected.subs(c3780e.Signature()).f36449e);
                return c14593e;
            case 10:
                return new C12034e(c3780e.f8385e.crashlytics());
            case 11:
                c14593e = new C1864e((C16449e) AbstractC12348e.tapsense.get(c3780e.f8386e.f32408e), Cprotected.subs(c3780e.Signature()).f36449e);
                return c14593e;
            case 12:
                isPro ispro = c3780e.f8385e;
                C16527e c16527e2 = c3780e.f8386e;
                byte[] m4602class3 = ispro.m4602class();
                Cprotected subs = (AbstractC12348e.vip(m4602class3) || m4602class3[0] != 4) ? null : Cprotected.subs(m4602class3);
                c14593e = subs != null ? new C10020e((C13948e) AbstractC12348e.subscription.get(c16527e2.f32408e), subs.f36449e) : new C10020e((C13948e) AbstractC12348e.subscription.get(c16527e2.f32408e), m4602class3);
                return c14593e;
            case 13:
                c14593e = new C6255e((C6000e) AbstractC12348e.yandex.get(c3780e.f8386e.f32408e), Cprotected.subs(c3780e.Signature()).f36449e);
                return c14593e;
            case 14:
                byte[] bArr2 = Cprotected.subs(c3780e.Signature()).f36449e;
                C12048e c12048e = (C12048e) AbstractC12348e.f24764class.get(c3780e.f8386e.f32408e);
                c14593e = new AbstractC0821e(false, c12048e);
                int i = c12048e.f24092e;
                int i2 = c12048e.f24093e;
                int i3 = c12048e.f24091e;
                int i4 = c12048e.f24094e;
                int i5 = c12048e.f24096e;
                Class cls = Short.TYPE;
                if (i5 == 1) {
                    c14593e.f6226e = (short[][][]) Array.newInstance((Class<?>) cls, i3, i4, i4);
                    int i6 = 0;
                    for (int i7 = 0; i7 < i4; i7++) {
                        for (int i8 = 0; i8 < i4; i8++) {
                            for (int i9 = 0; i9 < i3; i9++) {
                                short[][][] sArr = c14593e.f6226e;
                                if (i7 > i8) {
                                    sArr[i9][i7][i8] = 0;
                                } else {
                                    sArr[i9][i7][i8] = (short) (bArr2[i6] & 255);
                                    i6++;
                                }
                            }
                        }
                    }
                } else {
                    c14593e.f6228e = AbstractC12442e.admob(0, 32, bArr2);
                    short[][][] sArr2 = (short[][][]) Array.newInstance((Class<?>) cls, i2, c12048e.f24095e, i);
                    c14593e.f6225e = sArr2;
                    short[][][] sArr3 = (short[][][]) Array.newInstance((Class<?>) cls, i2, i2, i2);
                    c14593e.f6231e = sArr3;
                    short[][][] sArr4 = (short[][][]) Array.newInstance((Class<?>) cls, i2, i2, i);
                    c14593e.f6230e = sArr4;
                    short[][][] sArr5 = (short[][][]) Array.newInstance((Class<?>) cls, i2, i, i);
                    c14593e.f6227e = sArr5;
                    short[][][] sArr6 = (short[][][]) Array.newInstance((Class<?>) cls, i, i, i);
                    c14593e.f6229e = sArr6;
                    int smaato = AbstractC1085e.smaato(sArr2, bArr2, 32, false) + 32;
                    int smaato2 = AbstractC1085e.smaato(sArr3, bArr2, smaato, true) + smaato;
                    int smaato3 = AbstractC1085e.smaato(sArr4, bArr2, smaato2, false) + smaato2;
                    int smaato4 = AbstractC1085e.smaato(sArr5, bArr2, smaato3, true) + smaato3;
                    if (AbstractC1085e.smaato(sArr6, bArr2, smaato4, true) + smaato4 != bArr2.length) {
                        throw new IllegalArgumentException("unparsed data in key encoding");
                    }
                }
                return c14593e;
            case 15:
                c14593e = new C8225e((C18281e) AbstractC12348e.advert.get(c3780e.f8386e.f32408e), Cprotected.subs(Ccatch.m168class(c3780e.Signature()).mo171interface(0)).f36449e);
                return c14593e;
            case 16:
                try {
                    byte[] bArr3 = Cprotected.subs(c3780e.Signature()).f36449e;
                    c14593e2 = new C1061e((C4577e) AbstractC12348e.f24771throw.get(c3780e.f8386e.f32408e), AbstractC12442e.admob(4, bArr3.length, bArr3));
                    return c14593e2;
                } catch (Exception unused4) {
                    c14593e = new C1061e((C4577e) AbstractC12348e.f24771throw.get(c3780e.f8386e.f32408e), c3780e.f8385e.m4602class());
                    break;
                }
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                c14593e = new C7027e((C11526e) AbstractC12348e.inmobi.get(c3780e.f8386e.f32408e), Cprotected.subs(c3780e.Signature()).f36449e);
                return c14593e;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return new C7319e(AbstractC12348e.appmetrica(C11717e.loadAd(c3780e.f8386e.f32407e)), c3780e.f8385e.crashlytics());
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                try {
                    byte[] bArr4 = Cprotected.subs(c3780e.Signature()).f36449e;
                    c14593e2 = new C3960e((C7942e) AbstractC12348e.Signature.get(c3780e.f8386e.f32408e), AbstractC12442e.admob(4, bArr4.length, bArr4));
                    return c14593e2;
                } catch (Exception unused5) {
                    c14593e = new C3960e((C7942e) AbstractC12348e.Signature.get(c3780e.f8386e.f32408e), c3780e.f8385e.m4602class());
                    break;
                }
            case 20:
                c14593e = new C14077e((C3763e) AbstractC12348e.f24763break.get(c3780e.f8386e.f32408e), Cprotected.subs(c3780e.Signature()).f36449e);
                return c14593e;
            case 21:
                C10285e loadAd = C10285e.loadAd(c3780e.f8386e.f32407e);
                if (loadAd == null) {
                    byte[] bArr5 = Cprotected.subs(c3780e.Signature()).f36449e;
                    C11106e c11106e = new C11106e((C0368e) C0368e.yandex.get(Integer.valueOf(AbstractC3628e.metrica(0, bArr5))));
                    c11106e.f22006e = AbstractC16947e.license(bArr5);
                    ad2 = new C17464e(c11106e);
                    return ad2;
                }
                Ctry ctry = loadAd.f20301e.f32408e;
                Cdefault Signature = c3780e.Signature();
                C16474e c16474e = Signature != null ? new C16474e(Ccatch.m168class(Signature)) : null;
                C11106e c11106e2 = new C11106e(new C0368e(loadAd.f20302e, AbstractC12348e.ad(ctry)));
                c11106e2.f22009e = AbstractC16947e.license(AbstractC12442e.license(c16474e.f32300e));
                c11106e2.f22007e = AbstractC16947e.license(AbstractC12442e.license(c16474e.f32299e));
                return new C17464e(c11106e2);
            default:
                C17299e loadAd2 = C17299e.loadAd(c3780e.f8386e.f32407e);
                if (loadAd2 == null) {
                    byte[] bArr6 = Cprotected.subs(c3780e.Signature()).f36449e;
                    C11467e c11467e = new C11467e((C13719e) C13719e.appmetrica.get(Integer.valueOf(AbstractC3628e.metrica(0, bArr6))));
                    c11467e.f23071e = AbstractC16947e.license(bArr6);
                    ad2 = new C5529e(c11467e);
                    return ad2;
                }
                Ctry ctry2 = loadAd2.f33943e.f32408e;
                Cdefault Signature2 = c3780e.Signature();
                C16474e c16474e2 = Signature2 != null ? new C16474e(Ccatch.m168class(Signature2)) : null;
                C11467e c11467e2 = new C11467e(new C13719e(loadAd2.f33942e, loadAd2.f33941e, AbstractC12348e.ad(ctry2)));
                c11467e2.f23069e = AbstractC16947e.license(AbstractC12442e.license(c16474e2.f32300e));
                c11467e2.f23070e = AbstractC16947e.license(AbstractC12442e.license(c16474e2.f32299e));
                return new C5529e(c11467e2);
        }
    }
}
