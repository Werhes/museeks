package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import androidx.car.app.navigation.model.Maneuver;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkapi2.objects.music.Genre;
import ua.itaysonlab.vkx.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖۧٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C4526e implements Function1 {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f9819e;

    public /* synthetic */ C4526e(int i) {
        this.f9819e = i;
    }

    public /* synthetic */ C4526e(C12468e c12468e) {
        this.f9819e = 20;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C7838e c7838e;
        int i = 1;
        int i2 = 0;
        switch (this.f9819e) {
            case 0:
                C15074e c15074e = (C15074e) obj;
                long j = C3618e.vip;
                if (!C3618e.metrica(j, c15074e.f29850e)) {
                    c15074e.f29841e |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    c15074e.f29850e = j;
                }
                List singletonList = Collections.singletonList(new C10810e(C3618e.vip(0.25f, j)));
                if (!singletonList.equals(c15074e.f29839e)) {
                    c15074e.f29841e |= AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE;
                    c15074e.f29839e = singletonList;
                }
                if (0.05f != c15074e.f29840e) {
                    c15074e.f29841e |= 64;
                    c15074e.f29840e = 0.05f;
                }
                float f = 25;
                if (!C15765e.vip(f, c15074e.f29845e)) {
                    c15074e.f29841e |= 32;
                    c15074e.f29845e = f;
                }
                InterfaceC6412e interfaceC6412e = c15074e.f29860e;
                C8313e c8313e = C8313e.ad;
                if (!c8313e.equals(interfaceC6412e)) {
                    c15074e.f29860e = c8313e;
                    c15074e.f29841e |= 2;
                }
                if (true != c15074e.f29853e) {
                    c15074e.f29853e = true;
                    c15074e.f29841e |= 1;
                }
                c15074e.f29837e = true;
                return Unit.INSTANCE;
            case 1:
                throw AbstractC8647e.isVip(obj);
            case 2:
                C6351e c6351e = (C6351e) obj;
                c6351e.startapp = false;
                c6351e.adcel = false;
                c6351e.purchase = true;
                return Unit.INSTANCE;
            case 3:
                return Unit.INSTANCE;
            case 4:
                List m1869private = AbstractC5304e.m1869private((String) obj, new String[]{"//"}, 6);
                AbstractC14119e.vip.put(m1869private.get(0), m1869private.get(1));
                return Unit.INSTANCE;
            case 5:
                Map.Entry entry = (Map.Entry) obj;
                return ((String) entry.getKey()) + "//" + ((String) entry.getValue());
            case 6:
                List m1869private2 = AbstractC5304e.m1869private((String) obj, new String[]{"||"}, 6);
                AbstractC9001e.vip.put(m1869private2.get(0), m1869private2.get(1));
                return Unit.INSTANCE;
            case 7:
                Map.Entry entry2 = (Map.Entry) obj;
                return ((String) entry2.getKey()) + "||" + ((String) entry2.getValue());
            case 8:
                return C1158e.f3742e;
            case 9:
                return ((Genre) obj).vip;
            case 10:
                return Unit.INSTANCE;
            case 11:
                InterfaceC14927e interfaceC14927e = (InterfaceC14927e) obj;
                int i3 = AbstractC1834e.ad;
                Context context = (Context) interfaceC14927e.mo2377else(AbstractC2676e.vip);
                InterfaceC14388e interfaceC14388e = (InterfaceC14388e) interfaceC14927e.mo2377else(AbstractC11473e.yandex);
                C11179e c11179e = (C11179e) interfaceC14927e.mo2377else(AbstractC5931e.ad);
                if (c11179e == null) {
                    return null;
                }
                return new C10318e(context, interfaceC14388e, c11179e.ad, c11179e.vip);
            case 12:
                throw AbstractC8647e.isVip(obj);
            case 13:
                throw AbstractC8647e.isVip(obj);
            case 14:
                throw AbstractC8647e.isVip(obj);
            case 15:
                throw AbstractC8647e.isVip(obj);
            case 16:
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return ((AbstractC3219e) obj).ad;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                C7883e c7883e = (C7883e) obj;
                StringBuilder sb = new StringBuilder("position ");
                sb.append(c7883e.ad);
                sb.append(": '");
                return AbstractC4653e.applovin(sb, (String) c7883e.vip.invoke(), '\'');
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                ((Boolean) obj).booleanValue();
                return Unit.INSTANCE;
            case 20:
                throw AbstractC8647e.isVip(obj);
            case 21:
                float floatValue = ((Float) obj).floatValue();
                C7838e c7838e2 = VKXApplication.f36530e;
                c7838e = c7838e2 != null ? c7838e2 : null;
                c7838e.getClass();
                c7838e.yandex(new C6490e(c7838e, floatValue, i2));
                return Unit.INSTANCE;
            case 22:
                float floatValue2 = ((Float) obj).floatValue();
                C7838e c7838e3 = VKXApplication.f36530e;
                c7838e = c7838e3 != null ? c7838e3 : null;
                c7838e.getClass();
                c7838e.yandex(new C6490e(c7838e, floatValue2, i));
                return Unit.INSTANCE;
            case 23:
                return Unit.INSTANCE;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return C6097e.vip;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                Context context2 = (Context) obj;
                List<ResolveInfo> queryIntentActivities = context2.getPackageManager().queryIntentActivities(new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain"), 0);
                ArrayList arrayList = new ArrayList(queryIntentActivities.size());
                int size = queryIntentActivities.size();
                while (i2 < size) {
                    ResolveInfo resolveInfo = queryIntentActivities.get(i2);
                    ResolveInfo resolveInfo2 = resolveInfo;
                    if (!context2.getPackageName().equals(resolveInfo2.activityInfo.packageName)) {
                        ActivityInfo activityInfo = resolveInfo2.activityInfo;
                        if (activityInfo.exported) {
                            String str = activityInfo.permission;
                            if (str != null && context2.checkSelfPermission(str) != 0) {
                            }
                        }
                        i2++;
                    }
                    arrayList.add(resolveInfo);
                    i2++;
                }
                return arrayList;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                C17400e c17400e = (C17400e) obj;
                c17400e.ad = 1332;
                c17400e.ad(Float.valueOf(0.0f), 0).vip = AbstractC3135e.vip;
                c17400e.ad(Float.valueOf(290.0f), 666);
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                C17400e c17400e2 = (C17400e) obj;
                c17400e2.ad = 1332;
                c17400e2.ad(Float.valueOf(0.0f), 666).vip = AbstractC3135e.vip;
                c17400e2.ad(Float.valueOf(290.0f), c17400e2.ad);
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                C17400e c17400e3 = (C17400e) obj;
                c17400e3.ad = 6000;
                Float valueOf = Float.valueOf(90.0f);
                c17400e3.ad(valueOf, 300).vip = AbstractC0750e.vip;
                c17400e3.ad(valueOf, 1500);
                Float valueOf2 = Float.valueOf(180.0f);
                c17400e3.ad(valueOf2, 1800);
                c17400e3.ad(valueOf2, 3000);
                Float valueOf3 = Float.valueOf(270.0f);
                c17400e3.ad(valueOf3, 3300);
                c17400e3.ad(valueOf3, 4500);
                Float valueOf4 = Float.valueOf(360.0f);
                c17400e3.ad(valueOf4, 4800);
                c17400e3.ad(valueOf4, 6000);
                return Unit.INSTANCE;
            default:
                AbstractC14594e.mopub((InterfaceC15671e) obj, C0196e.license);
                return Unit.INSTANCE;
        }
    }
}
