package defpackage;

import android.content.SharedPreferences;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import androidx.car.app.navigation.model.Maneuver;
import com.google.android.material.tabs.TabLayout;
import java.util.List;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؗؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C10068e implements InterfaceC15269e, InterfaceC16700e, InterfaceC4732e, InterfaceC9575e, InterfaceC13204e, InterfaceC5808e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f19899e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final /* synthetic */ C10068e f19894e = new C10068e(14);

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final /* synthetic */ C10068e f19893e = new C10068e(16);

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final /* synthetic */ C10068e f19896e = new C10068e(17);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final /* synthetic */ C10068e f19892e = new C10068e(18);

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final /* synthetic */ C10068e f19898e = new C10068e(19);

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final /* synthetic */ C10068e f19897e = new C10068e(20);

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final /* synthetic */ C10068e f19895e = new C10068e(21);

    public /* synthetic */ C10068e(int i) {
        this.f19899e = i;
    }

    public static long appmetrica(C4211e c4211e, float f) {
        float[] fArr = c4211e.ad;
        int i = 1;
        long ad = C9268e.ad(fArr[0], fArr[1]);
        float f2 = 0.0f;
        float f3 = f;
        while (true) {
            float f4 = 3;
            float f5 = i / f4;
            long metrica = c4211e.metrica(f5);
            float mopub = AbstractC11613e.mopub(AbstractC11613e.tapsense(metrica, ad));
            if (mopub >= f3) {
                return C9268e.ad(f5 - ((1.0f - (f3 / mopub)) / f4), f);
            }
            f3 -= mopub;
            f2 += mopub;
            if (i == 3) {
                return C9268e.ad(1.0f, f2);
            }
            i++;
            ad = metrica;
        }
    }

    public static RectF license(TabLayout tabLayout, View view) {
        if (view == null) {
            return new RectF();
        }
        if (tabLayout.f917e || !(view instanceof C10937e)) {
            return new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        C10937e c10937e = (C10937e) view;
        int contentWidth = c10937e.getContentWidth();
        int contentHeight = c10937e.getContentHeight();
        int vip = (int) AbstractC6286e.vip(c10937e.getContext(), 24);
        if (contentWidth < vip) {
            contentWidth = vip;
        }
        int right = (c10937e.getRight() + c10937e.getLeft()) / 2;
        int bottom = (c10937e.getBottom() + c10937e.getTop()) / 2;
        int i = contentWidth / 2;
        return new RectF(right - i, bottom - (contentHeight / 2), i + right, (right / 2) + bottom);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object metrica(java.lang.String r7, defpackage.AbstractC10731e r8) {
        /*
            int r0 = defpackage.C13552e.f26851e
            boolean r0 = r8 instanceof defpackage.C13251e
            if (r0 == 0) goto L15
            r0 = r8
            eؙْٔ r0 = (defpackage.C13251e) r0
            int r1 = r0.f26285e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L15
            int r1 = r1 - r2
            r0.f26285e = r1
            goto L1a
        L15:
            eؙْٔ r0 = new eؙْٔ
            r0.<init>(r8)
        L1a:
            java.lang.Object r8 = r0.f26286e
            int r1 = r0.f26285e
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            defpackage.AbstractC2003e.purchase(r8)
            goto L5a
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            defpackage.AbstractC2003e.purchase(r8)
            eًٕؑ r8 = new eًٕؑ
            java.lang.String r1 = "/search/"
            java.lang.Class<bruhcollective.itaysonlab.libvkmusic.methods.uma.UmaSearch$Preapi> r3 = bruhcollective.itaysonlab.libvkmusic.methods.uma.UmaSearch$Preapi.class
            r8.<init>(r3, r1)
            java.lang.String r1 = "q"
            r8.startapp(r1, r7)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r2)
            java.util.HashMap r1 = r8.metrica
            java.lang.String r7 = r7.toString()
            java.lang.String r3 = "limit"
            r1.put(r3, r7)
            r0.f26285e = r2
            java.lang.Object r8 = r8.vip(r0)
            eٟؔۙ r7 = defpackage.EnumC2821e.f6782e
            if (r8 != r7) goto L5a
            return r7
        L5a:
            bruhcollective.itaysonlab.libvkmusic.methods.uma.UmaSearch$Preapi r8 = (bruhcollective.itaysonlab.libvkmusic.methods.uma.UmaSearch$Preapi) r8
            if (r8 != 0) goto L6b
            bruhcollective.itaysonlab.libvkmusic.methods.uma.UmaSearch$Preapi r0 = new bruhcollective.itaysonlab.libvkmusic.methods.uma.UmaSearch$Preapi
            r5 = 0
            r6 = 31
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r0
        L6b:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C10068e.metrica(java.lang.String, eُؑ۠):java.lang.Object");
    }

    public static C10675e purchase(C10675e c10675e, C10675e c10675e2) {
        return C17345e.f34029e.appmetrica(AbstractC5304e.m1852case(c10675e.f21024e.remoteconfig(), c10675e2.f21024e.remoteconfig()).replace('\\', '/'));
    }

    public static final boolean vip(C10675e c10675e) {
        C10675e c10675e2 = C17345e.f34029e;
        return !AbstractC6507e.amazon(c10675e.vip(), ".class", true);
    }

    @Override // defpackage.InterfaceC13204e
    public Object ad() {
        switch (this.f19899e) {
            case 14:
                return new Boolean(((Boolean) C4452e.vip.get()).booleanValue());
            case 15:
            default:
                List list = AbstractC17254e.ad;
                C4261e.f9346e.get();
                return (Boolean) C13302e.ad.license("measurement.rb.attribution.client2", true, 1).get();
            case 16:
                List list2 = AbstractC17254e.ad;
                C1788e.f4842e.get();
                return (Long) C15469e.ad.billing(240000L, 40, "measurement.sgtm.batch.long_queuing_threshold").get();
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                List list3 = AbstractC17254e.ad;
                C1788e.f4842e.get();
                return Integer.valueOf((int) ((Long) C15469e.ad.billing(6L, 76, "measurement.upload.retry_count").get()).longValue());
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                List list4 = AbstractC17254e.ad;
                C1788e.f4842e.get();
                return Integer.valueOf((int) ((Long) C15469e.ad.billing(500L, 19, "measurement.upload.max_event_parameter_value_length").get()).longValue());
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                List list5 = AbstractC17254e.ad;
                C1788e.f4842e.get();
                return (String) C15469e.ad.yandex("measurement.rb.attribution.query_parameters_to_remove", 59, BuildConfig.FLAVOR).get();
            case 20:
                List list6 = AbstractC17254e.ad;
                return (Boolean) C6925e.ad.get();
        }
    }

    @Override // defpackage.InterfaceC16700e
    public void adcel(SharedPreferences sharedPreferences, String str, Object obj) {
        Boolean bool = (Boolean) obj;
        bool.getClass();
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putBoolean(str, bool.booleanValue());
        edit.apply();
    }

    public void billing(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        RectF license = license(tabLayout, view);
        RectF license2 = license(tabLayout, view2);
        drawable.setBounds(AbstractC16664e.metrica((int) license.left, f, (int) license2.left), drawable.getBounds().top, AbstractC16664e.metrica((int) license.right, f, (int) license2.right), drawable.getBounds().bottom);
    }

    @Override // defpackage.InterfaceC16964e
    public Object get() {
        return C16723e.ad;
    }

    @Override // defpackage.InterfaceC4732e
    public void mopub(int i, Object obj) {
        String str;
        switch (i) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = BuildConfig.FLAVOR;
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i == 6 || i == 7 || i == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
    }

    /* JADX WARN: Type inference failed for: r4v13, types: [java.lang.Object, eِؖٗ] */
    @Override // defpackage.InterfaceC5808e
    public Object smaato(C18464e c18464e) {
        switch (this.f19899e) {
            case 15:
                return new C3200e((C2316e) c18464e.ad(C2316e.class));
            default:
                synchronized (AbstractC6232e.class) {
                    byte b = (byte) (((byte) 1) | 2);
                    if (b != 3) {
                        StringBuilder sb = new StringBuilder();
                        if ((b & 1) == 0) {
                            sb.append(" enableFirelog");
                        }
                        if ((b & 2) == 0) {
                            sb.append(" firelogEventType");
                        }
                        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
                    }
                    AbstractC6232e.startapp(new Object());
                }
                return new C9616e(0);
        }
    }

    @Override // defpackage.InterfaceC4732e
    public void startapp() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // defpackage.InterfaceC16700e
    public Object yandex(SharedPreferences sharedPreferences, String str, Object obj) {
        return Boolean.valueOf(sharedPreferences.getBoolean(str, ((Boolean) obj).booleanValue()));
    }
}
