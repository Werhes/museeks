package defpackage;

import android.content.ContextWrapper;
import android.text.TextUtils;
import androidx.preference.EditTextPreference;
import androidx.preference.Preference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;
import kotlin.jvm.functions.Function3;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖۥٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16628e implements InterfaceC0774e, InterfaceC3971e, InterfaceC5808e, InterfaceC14312e, InterfaceC2684e, InterfaceC11962e, InterfaceC2872e, InterfaceC5368e, InterfaceC7069e {

    /* renamed from: eّٜۦ, reason: contains not printable characters */
    public static C16628e f32610e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f32615e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final C16628e f32601e = new C16628e(1);

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final C17365e f32596e = new Object();

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final C16628e f32609e = new C16628e(3);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final C16628e f32593e = new C16628e(4);

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final C16628e f32613e = new C16628e(5);

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final C16628e f32612e = new C16628e(6);

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final C16628e f32605e = new C16628e(7);

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public static final C16628e f32611e = new C16628e(8);

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public static final C16628e f32597e = new C16628e(9);

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public static final C11180e f32606e = new C11180e(15);

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public static final C16628e f32595e = new C16628e(12);

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public static final C16628e f32594e = new C16628e(13);

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public static final C16628e f32599e = new C16628e(14);

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public static final C16628e f32603e = new C16628e(15);

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public static final C16628e f32604e = new C16628e(16);

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public static final C16628e f32602e = new C16628e(17);

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public static final C16628e f32600e = new C16628e(18);

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public static final C16628e f32608e = new C16628e(19);

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public static final C16628e f32614e = new C16628e(20);

    /* renamed from: eؙؕ, reason: contains not printable characters */
    public static final C16628e f32598e = new C16628e(21);

    /* renamed from: eَٕٞ, reason: contains not printable characters */
    public static final C16628e f32607e = new C16628e(22);

    public /* synthetic */ C16628e(int i) {
        this.f32615e = i;
    }

    public static LinkedHashSet advert(String str, String... strArr) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str2 : strArr) {
            linkedHashSet.add(str + '.' + str2);
        }
        return linkedHashSet;
    }

    public static LinkedHashSet amazon(String str, String... strArr) {
        return advert("java/lang/".concat(str), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static LinkedHashSet loadAd(String str, String... strArr) {
        return advert("java/util/".concat(str), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static String[] mopub(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add("<init>(" + str + ")V");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    @Override // defpackage.InterfaceC2684e
    public boolean ad(InterfaceC5052e interfaceC5052e, C0530e c0530e) {
        return true;
    }

    @Override // defpackage.InterfaceC5368e
    public InterfaceC17431e adcel() {
        return new C14778e(C5833e.advert, null);
    }

    @Override // defpackage.InterfaceC5368e
    public InterfaceC17431e appmetrica(C5833e c5833e, C9144e c9144e) {
        return new C14778e(c5833e, c9144e);
    }

    public void billing(InterfaceC4629e interfaceC4629e) {
        interfaceC4629e.startapp(C17601e.class, C16295e.ad);
        interfaceC4629e.startapp(C7964e.class, C10183e.ad);
        interfaceC4629e.startapp(AbstractC13461e.class, C1987e.ad);
        interfaceC4629e.startapp(AbstractC18268e.class, C1858e.ad);
        interfaceC4629e.startapp(AbstractC2127e.class, C5747e.ad);
        interfaceC4629e.startapp(AbstractC14073e.class, C12238e.ad);
        interfaceC4629e.startapp(AbstractC8508e.class, C1885e.ad);
        interfaceC4629e.startapp(AbstractC12110e.class, C1728e.ad);
        interfaceC4629e.startapp(AbstractC0207e.class, C17945e.ad);
        interfaceC4629e.startapp(AbstractC16619e.class, C15353e.ad);
        interfaceC4629e.startapp(AbstractC5729e.class, C0992e.ad);
        interfaceC4629e.startapp(AbstractC15268e.class, C5491e.ad);
        interfaceC4629e.startapp(AbstractC14430e.class, C10338e.ad);
        interfaceC4629e.startapp(AbstractC2251e.class, C12629e.ad);
        interfaceC4629e.startapp(AbstractC9931e.class, C17885e.ad);
        interfaceC4629e.startapp(C17150e.class, C14327e.ad);
        interfaceC4629e.startapp(AbstractC12176e.class, C5184e.ad);
        interfaceC4629e.startapp(AbstractC6537e.class, C8671e.ad);
        interfaceC4629e.startapp(AbstractC13201e.class, C2592e.ad);
        interfaceC4629e.startapp(C17138e.class, C9540e.ad);
        interfaceC4629e.startapp(AbstractC0181e.class, C10038e.ad);
        interfaceC4629e.startapp(AbstractC8294e.class, C5691e.ad);
        interfaceC4629e.startapp(AbstractC8749e.class, C10788e.ad);
        interfaceC4629e.startapp(AbstractC9186e.class, C3563e.ad);
        interfaceC4629e.startapp(AbstractC0578e.class, C15555e.ad);
        interfaceC4629e.startapp(AbstractC14385e.class, C15884e.ad);
        interfaceC4629e.startapp(AbstractC0815e.class, C14660e.ad);
        interfaceC4629e.startapp(AbstractC0718e.class, C10254e.ad);
        interfaceC4629e.startapp(AbstractC17352e.class, C12821e.ad);
        interfaceC4629e.startapp(AbstractC8433e.class, C8719e.ad);
        interfaceC4629e.startapp(AbstractC5857e.class, C9467e.ad);
        interfaceC4629e.startapp(AbstractC13281e.class, C2480e.ad);
        interfaceC4629e.startapp(AbstractC13350e.class, C7624e.ad);
        interfaceC4629e.startapp(AbstractC7354e.class, C6383e.ad);
        interfaceC4629e.startapp(AbstractC11765e.class, C9776e.ad);
        interfaceC4629e.startapp(AbstractC14059e.class, C8634e.ad);
        interfaceC4629e.startapp(AbstractC1798e.class, C12304e.ad);
        interfaceC4629e.startapp(C8738e.class, C14344e.ad);
        interfaceC4629e.startapp(AbstractC2270e.class, C12390e.ad);
        interfaceC4629e.startapp(AbstractC7535e.class, C10820e.ad);
        interfaceC4629e.startapp(AbstractC12184e.class, C8273e.ad);
        interfaceC4629e.startapp(C7290e.class, C11604e.ad);
        interfaceC4629e.startapp(AbstractC17202e.class, C3767e.ad);
        interfaceC4629e.startapp(AbstractC5756e.class, C15434e.ad);
        interfaceC4629e.startapp(AbstractC6069e.class, C6042e.ad);
        interfaceC4629e.startapp(AbstractC18275e.class, C1657e.ad);
        interfaceC4629e.startapp(AbstractC13362e.class, C15712e.ad);
        interfaceC4629e.startapp(AbstractC7070e.class, C2197e.ad);
        interfaceC4629e.startapp(AbstractC12315e.class, C3550e.ad);
        interfaceC4629e.startapp(AbstractC15390e.class, C9642e.ad);
        interfaceC4629e.startapp(AbstractC1129e.class, C10487e.ad);
        interfaceC4629e.startapp(AbstractC13062e.class, C14264e.ad);
        interfaceC4629e.startapp(C14155e.class, C6855e.ad);
        interfaceC4629e.startapp(AbstractC8228e.class, C3640e.ad);
        interfaceC4629e.startapp(AbstractC17331e.class, C18249e.ad);
        interfaceC4629e.startapp(AbstractC13510e.class, C17356e.ad);
        interfaceC4629e.startapp(AbstractC5209e.class, C15872e.ad);
        interfaceC4629e.startapp(AbstractC7844e.class, C6946e.ad);
        interfaceC4629e.startapp(AbstractC11160e.class, C14482e.ad);
        interfaceC4629e.startapp(AbstractC4628e.class, C9251e.ad);
        interfaceC4629e.startapp(AbstractC16425e.class, C16053e.ad);
        interfaceC4629e.startapp(AbstractC3752e.class, C3228e.ad);
        interfaceC4629e.startapp(AbstractC15842e.class, C7585e.ad);
        interfaceC4629e.startapp(AbstractC8636e.class, C2492e.ad);
        interfaceC4629e.startapp(AbstractC16481e.class, C15818e.ad);
        interfaceC4629e.startapp(AbstractC5400e.class, C5197e.ad);
        interfaceC4629e.startapp(AbstractC11309e.class, C10317e.ad);
        interfaceC4629e.startapp(AbstractC7518e.class, C3815e.ad);
        interfaceC4629e.startapp(AbstractC13482e.class, C9679e.ad);
        interfaceC4629e.startapp(AbstractC5851e.class, C0864e.ad);
        interfaceC4629e.startapp(AbstractC18209e.class, C4729e.ad);
        interfaceC4629e.startapp(AbstractC5297e.class, C15756e.ad);
        interfaceC4629e.startapp(AbstractC17540e.class, C12080e.ad);
        interfaceC4629e.startapp(AbstractC1266e.class, C0403e.ad);
        interfaceC4629e.startapp(AbstractC5097e.class, C15459e.ad);
        interfaceC4629e.startapp(AbstractC1574e.class, C18088e.ad);
        interfaceC4629e.startapp(AbstractC0179e.class, C16642e.ad);
        interfaceC4629e.startapp(AbstractC9408e.class, C4439e.ad);
        interfaceC4629e.startapp(AbstractC3265e.class, C7047e.ad);
        interfaceC4629e.startapp(AbstractC0111e.class, C18033e.ad);
        interfaceC4629e.startapp(AbstractC16082e.class, C3126e.ad);
        interfaceC4629e.startapp(AbstractC2194e.class, C5940e.ad);
        interfaceC4629e.startapp(AbstractC1513e.class, C2097e.ad);
        interfaceC4629e.startapp(AbstractC11138e.class, C13923e.ad);
        interfaceC4629e.startapp(AbstractC9528e.class, C9334e.ad);
        interfaceC4629e.startapp(AbstractC16275e.class, C13855e.ad);
        interfaceC4629e.startapp(AbstractC4265e.class, C2496e.ad);
        interfaceC4629e.startapp(AbstractC17419e.class, C3738e.ad);
        interfaceC4629e.startapp(AbstractC2301e.class, C16698e.ad);
        interfaceC4629e.startapp(AbstractC11263e.class, C7061e.ad);
        interfaceC4629e.startapp(AbstractC2223e.class, C3724e.ad);
        interfaceC4629e.startapp(AbstractC13083e.class, C8709e.ad);
        interfaceC4629e.startapp(AbstractC11613e.class, C17730e.ad);
        interfaceC4629e.startapp(C10440e.class, C15776e.ad);
        interfaceC4629e.startapp(AbstractC10672e.class, C10995e.ad);
        interfaceC4629e.startapp(AbstractC15890e.class, C8659e.ad);
        interfaceC4629e.startapp(AbstractC16519e.class, C16215e.ad);
        interfaceC4629e.startapp(AbstractC14114e.class, C18363e.ad);
        interfaceC4629e.startapp(AbstractC6401e.class, C3086e.ad);
        interfaceC4629e.startapp(AbstractC1284e.class, C18379e.ad);
        interfaceC4629e.startapp(AbstractC12246e.class, C8774e.ad);
        interfaceC4629e.startapp(AbstractC12696e.class, C16484e.ad);
        interfaceC4629e.startapp(AbstractC1328e.class, C5739e.ad);
        interfaceC4629e.startapp(AbstractC1660e.class, C4733e.ad);
        interfaceC4629e.startapp(AbstractC12442e.class, C8442e.ad);
        interfaceC4629e.startapp(AbstractC8210e.class, C10863e.ad);
        interfaceC4629e.startapp(AbstractC5336e.class, C15457e.ad);
        interfaceC4629e.startapp(AbstractC5706e.class, C14467e.ad);
        interfaceC4629e.startapp(AbstractC7711e.class, C14717e.ad);
        interfaceC4629e.startapp(AbstractC4584e.class, C14108e.ad);
        interfaceC4629e.startapp(AbstractC13328e.class, C14538e.ad);
        interfaceC4629e.startapp(AbstractC8306e.class, C8120e.ad);
        interfaceC4629e.startapp(AbstractC9357e.class, C18433e.ad);
        interfaceC4629e.startapp(AbstractC3628e.class, C14030e.ad);
        interfaceC4629e.startapp(AbstractC11267e.class, C4365e.ad);
        interfaceC4629e.startapp(AbstractC8439e.class, C12739e.ad);
        interfaceC4629e.startapp(AbstractC9164e.class, C10401e.ad);
        interfaceC4629e.startapp(AbstractC14410e.class, C10146e.ad);
        interfaceC4629e.startapp(AbstractC16279e.class, C15152e.ad);
        interfaceC4629e.startapp(AbstractC15203e.class, C8820e.ad);
        interfaceC4629e.startapp(AbstractC10653e.class, C16769e.ad);
        interfaceC4629e.startapp(AbstractC13406e.class, C4615e.ad);
        interfaceC4629e.startapp(AbstractC8797e.class, C16935e.ad);
        interfaceC4629e.startapp(AbstractC9460e.class, C1606e.ad);
        interfaceC4629e.startapp(AbstractC3192e.class, C0131e.ad);
        interfaceC4629e.startapp(AbstractC17957e.class, C10706e.ad);
        interfaceC4629e.startapp(AbstractC17751e.class, C15350e.ad);
        interfaceC4629e.startapp(AbstractC7595e.class, C13651e.ad);
        interfaceC4629e.startapp(AbstractC16155e.class, C12145e.ad);
        interfaceC4629e.startapp(AbstractC17976e.class, C5449e.ad);
        interfaceC4629e.startapp(AbstractC11575e.class, C10341e.ad);
        interfaceC4629e.startapp(AbstractC18491e.class, C4505e.ad);
        interfaceC4629e.startapp(AbstractC12992e.class, C13092e.ad);
        interfaceC4629e.startapp(AbstractC12900e.class, C16988e.ad);
        interfaceC4629e.startapp(AbstractC12681e.class, C1796e.ad);
        interfaceC4629e.startapp(AbstractC9600e.class, C14361e.ad);
        interfaceC4629e.startapp(AbstractC16994e.class, C18038e.ad);
        interfaceC4629e.startapp(AbstractC12475e.class, C17390e.ad);
        interfaceC4629e.startapp(AbstractC18453e.class, C5523e.ad);
        interfaceC4629e.startapp(AbstractC12684e.class, C9996e.ad);
        interfaceC4629e.startapp(AbstractC5032e.class, C10225e.ad);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC0774e
    /* renamed from: eؒۖۗ */
    public void mo400e(C9398e c9398e, AbstractC7185e abstractC7185e) {
        C3079e c3079e = new C3079e("ObservableContent");
        C13886e c13886e = c9398e.f18713e;
        c13886e.startapp(C13886e.f27543e, c3079e);
        c13886e.mopub(c3079e, new C7054e((Function3) abstractC7185e, null, 0));
    }

    @Override // defpackage.InterfaceC14312e
    public void license(int i, AbstractC5113e abstractC5113e, C12701e c12701e) {
    }

    @Override // defpackage.InterfaceC14312e
    public void metrica() {
    }

    @Override // defpackage.InterfaceC7069e
    public CharSequence purchase(Preference preference) {
        EditTextPreference editTextPreference = (EditTextPreference) preference;
        if (TextUtils.isEmpty(null)) {
            return editTextPreference.f545e.getString(R.string.not_set);
        }
        return null;
    }

    @Override // defpackage.InterfaceC5808e
    public Object smaato(C18464e c18464e) {
        return AbstractC18275e.purchase((Executor) c18464e.inmobi(new C16786e(InterfaceC10123e.class, Executor.class)));
    }

    @Override // defpackage.InterfaceC14312e
    public void startapp(AbstractC5113e abstractC5113e) {
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0156  */
    @Override // defpackage.InterfaceC11962e
    /* renamed from: this */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo600this(defpackage.AbstractC16824e r11, defpackage.AbstractC10731e r12) {
        /*
            Method dump skipped, instructions count: 508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C16628e.mo600this(eؘٗٙ, eُؑ۠):java.lang.Object");
    }

    @Override // defpackage.InterfaceC3971e
    public float vip(ContextWrapper contextWrapper) {
        return contextWrapper.getResources().getDisplayMetrics().density;
    }

    @Override // defpackage.InterfaceC2872e
    public long yandex(long j, long j2) {
        float max = Math.max(Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L)));
        long floatToRawIntBits = (Float.floatToRawIntBits(max) << 32) | (Float.floatToRawIntBits(max) & 4294967295L);
        int i = AbstractC14770e.ad;
        return floatToRawIntBits;
    }
}
