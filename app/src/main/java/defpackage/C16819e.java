package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.io.File;
import java.util.ArrayList;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;
import ua.itaysonlab.vkx.service.MediaReceiver;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؘٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16819e implements InterfaceC16294e {
    public static final C16819e ad = new Object();

    /* JADX WARN: Type inference failed for: r12v0, types: [eّٔۖ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v0, types: [android.database.sqlite.SQLiteOpenHelper, eؘؘؘ] */
    @Override // defpackage.InterfaceC16294e
    public final void ad(Context context) {
        Context applicationContext = context.getApplicationContext();
        int i = 5;
        int i2 = 0;
        InterfaceC5083e interfaceC5083e = null;
        if (VKXApplication.f36530e != null) {
            AbstractC14966e.ad(AbstractC11575e.vip(C9988e.ad), 5, "Trying to create already created PlaybackControllerImpl!", null);
        } else {
            C7838e.f15858e = new C12894e(27, new C14136e(28), new C14648e(applicationContext, i), new C14136e(29));
            ?? sQLiteOpenHelper = new SQLiteOpenHelper(applicationContext.getApplicationContext(), "exoplayer_internal.db", (SQLiteDatabase.CursorFactory) null, 1);
            File file = new File(applicationContext.getCacheDir(), "oc_exocache");
            Context applicationContext2 = applicationContext.getApplicationContext();
            C10301e c10301e = C10301e.f20325e;
            ?? obj = new Object();
            C1343e ad2 = AbstractC12918e.ad();
            C11328e metrica = AbstractC1831e.metrica();
            C8531e c8531e = new C8531e(file, new C5889e(), sQLiteOpenHelper);
            C15945e c15945e = new C15945e(24);
            C13985e c13985e = C13985e.ad;
            C14260e c14260e = C14260e.ad;
            C7838e c7838e = new C7838e(applicationContext2, c10301e, obj, ad2, c8531e, sQLiteOpenHelper, file, c15945e, c13985e, metrica, new C11689e(i2));
            VKXApplication.f36530e = c7838e;
            Object obj2 = new Object();
            ArrayList arrayList = c7838e.f15866e;
            arrayList.add(obj2);
            arrayList.add(new Object());
            arrayList.add(C11908e.ad);
            arrayList.add(C16129e.ad);
        }
        int i3 = 2;
        C5687e c5687e = new C5687e(context, i3);
        AbstractC0903e.billing = R.drawable.generic_audio_nowplaying;
        AbstractC0903e.yandex = c5687e;
        AbstractC8561e.ad = context.getApplicationContext().getSharedPreferences("lastfmutil", 0);
        AbstractC8561e.vip = true;
        C10839e c10839e = C10839e.ad;
        C10839e.vip.put("vk", C1369e.ad);
        context.getApplicationContext().registerReceiver(new MediaReceiver(), new IntentFilter("android.intent.action.HEADSET_PLUG"));
        VKXApplication vKXApplication = VKXApplication.f36528e;
        if (vKXApplication == null) {
            vKXApplication = null;
        }
        AbstractC5336e.purchase(vKXApplication, AbstractC6731e.ad, 0, new C12559e(i3, 15, interfaceC5083e), 2);
    }
}
