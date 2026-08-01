package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.adcel;
import androidx.recyclerview.widget.startapp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import org.conscrypt.BuildConfig;
import ua.itaysonlab.catalogkit.objects.Catalog2Response;
import ua.itaysonlab.catalogkit.objects.Catalog2Text;
import ua.itaysonlab.catalogkit.objects.seals.Catalog2Layout;
import ua.itaysonlab.vkapi2.objects.newsfeed.NewsfeedItem;
import ua.itaysonlab.vkapi2.objects.users.VKProfile;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;
import ua.itaysonlab.vkxreborn.ui.ThemedRecyclerView;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖؔۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3861e extends AbstractC9870e {

    /* renamed from: eّؑۛ, reason: contains not printable characters */
    public final String f8693e;

    /* renamed from: eؘؑۦ, reason: contains not printable characters */
    public String f8694e;

    /* renamed from: eُِٔ, reason: contains not printable characters */
    public String f8696e;

    /* renamed from: eؘِْ, reason: contains not printable characters */
    public Integer f8697e;

    /* renamed from: eؚۚۦ, reason: contains not printable characters */
    public List f8695e = C13664e.f27089e;

    /* renamed from: eَٔٞ, reason: contains not printable characters */
    public final ArrayList f8698e = new ArrayList();

    /* renamed from: eّٖٗ, reason: contains not printable characters */
    public final ArrayList f8700e = new ArrayList();

    /* renamed from: eٖٕٚ, reason: contains not printable characters */
    public final C3675e f8699e = new C3675e(new Catalog2Response(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 536870911));

    public C3861e() {
        VKXApplication.Companion companion = VKXApplication.f36531e;
        this.f8693e = VKXApplication.Companion.vip(R.string.acc_news);
    }

    @Override // defpackage.AbstractC9870e, defpackage.AbstractC10716e
    /* renamed from: break */
    public final String mo1348break() {
        return this.f8693e;
    }

    @Override // defpackage.AbstractC9870e
    /* renamed from: else, reason: not valid java name */
    public final Object mo1405else(List list, InterfaceC5083e interfaceC5083e) {
        ArrayList arrayList;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (!((NewsfeedItem) obj).admob) {
                arrayList2.add(obj);
            }
        }
        Iterator it = arrayList2.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            int i = 0;
            arrayList = this.f8698e;
            if (!hasNext) {
                break;
            }
            NewsfeedItem newsfeedItem = (NewsfeedItem) it.next();
            List singletonList = Collections.singletonList(newsfeedItem);
            ArrayList arrayList3 = new ArrayList();
            C10990e.Signature(singletonList, new C2191e(4, arrayList3));
            String str = newsfeedItem.ad;
            String str2 = newsfeedItem.purchase;
            List singletonList2 = Collections.singletonList(newsfeedItem);
            ArrayList arrayList4 = new ArrayList();
            C10990e.Signature(singletonList2, new C2191e(5, arrayList4));
            this.f8700e.addAll(arrayList3);
            boolean billing = AbstractC7890e.billing(str, "recommended_audios");
            C3675e c3675e = this.f8699e;
            if (billing) {
                String str3 = newsfeedItem.appmetrica;
                if (str3 == null) {
                    str3 = BuildConfig.FLAVOR;
                }
                arrayList.add(new C5755e(C7705e.ad, new Catalog2Layout.CompactHeader(str3), newsfeedItem.yandex));
            } else {
                LinkedHashMap linkedHashMap = c3675e.yandex;
                Integer num = newsfeedItem.metrica;
                if (num == null) {
                    num = newsfeedItem.license;
                }
                VKProfile vKProfile = (VKProfile) linkedHashMap.get(String.valueOf(num));
                if (vKProfile == null) {
                    vKProfile = VKProfile.yandex;
                }
                arrayList.add(new C4818e(newsfeedItem, vKProfile));
            }
            String str4 = "_synth_post_info";
            int i2 = 4;
            if (AbstractC7890e.billing(str, "audio_playlist")) {
                C7350e c7350e = new C7350e(8);
                c7350e.firebase(Collections.singletonList(new Catalog2Text(i, i2, str4, "добавил плейлисты в библиотеку:")));
                arrayList.add(c7350e);
            } else if (AbstractC7890e.billing(str, "audio")) {
                C7350e c7350e2 = new C7350e(8);
                c7350e2.firebase(Collections.singletonList(new Catalog2Text(i, i2, str4, "добавил аудиозаписи в библиотеку:")));
                arrayList.add(c7350e2);
            }
            if (str2 != null && str2.length() != 0) {
                C7350e c7350e3 = new C7350e(8);
                c7350e3.firebase(Collections.singletonList(new Catalog2Text(i, i2, "_synth_post", str2)));
                arrayList.add(c7350e3);
            }
            if (!arrayList3.isEmpty()) {
                C11268e c11268e = new C11268e(false, false, 0, C14611e.ad, null, null, 116);
                c11268e.f22635e = new C12012e(this, 0);
                c11268e.firebase(arrayList3);
                arrayList.add(c11268e);
            }
            if (!arrayList4.isEmpty()) {
                C12678e c12678e = new C12678e(3, false, c3675e);
                c12678e.firebase(arrayList4);
                arrayList.add(c12678e);
            }
            arrayList.add(new startapp());
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            m2742synchronized().ads((startapp) it2.next());
        }
        this.f8234e = true;
        this.f8224e = false;
        return Unit.INSTANCE;
    }

    @Override // defpackage.AbstractC3655e
    /* renamed from: final */
    public final startapp mo1386final() {
        return new C17199e(C13875e.f27483e, new startapp[0]);
    }

    @Override // defpackage.AbstractC3655e
    /* renamed from: import */
    public final void mo1387import() {
        ThemedRecyclerView themedRecyclerView = this.f8230e;
        if (themedRecyclerView == null) {
            themedRecyclerView = null;
        }
        adcel layoutManager = themedRecyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager != null && !this.f8224e && linearLayoutManager.m97e() >= m2742synchronized().billing() - 1 && this.f8237e) {
            int i = this.f8226e + this.f8227e;
            this.f8226e = i;
            mo1391private(i);
        }
    }

    @Override // defpackage.AbstractC3655e
    /* renamed from: new */
    public final void mo1389new() {
        this.f8694e = null;
        this.f8699e.vip();
        this.f8700e.clear();
        ArrayList arrayList = this.f8698e;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m2742synchronized().subs((startapp) it.next());
        }
        arrayList.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0098, code lost:
    
        if (defpackage.AbstractC5336e.advert(r11, r1, r0) != r6) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e3 A[LOOP:0: B:20:0x00dd->B:22:0x00e3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // defpackage.AbstractC9870e
    /* renamed from: return */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo215return(int r10, defpackage.InterfaceC5083e r11) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3861e.mo215return(int, eًؗۖ):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eۦؕ, java.lang.Object] */
    @Override // defpackage.AbstractC3655e, defpackage.AbstractC10716e
    /* renamed from: try */
    public final AbstractC18491e mo216try() {
        return new Object();
    }
}
