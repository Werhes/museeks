package defpackage;

import android.app.Activity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.startapp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ua.itaysonlab.catalogkit.objects.Catalog2Text;
import ua.itaysonlab.catalogkit.objects.seals.Catalog2Layout;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist;
import ua.itaysonlab.vkapi2.objects.users.VKProfile;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.activity.AppActivity;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٕۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15820e extends AbstractC9870e {

    /* renamed from: eّؑۛ, reason: contains not printable characters */
    public String f31204e;

    /* renamed from: eٖؗۘ, reason: contains not printable characters */
    public C16482e f31205e;

    /* renamed from: eؘؑۦ, reason: contains not printable characters */
    public int f31206e;

    /* renamed from: eؘؙؕ, reason: contains not printable characters */
    public final int f31207e;

    /* renamed from: eؙٚؑ, reason: contains not printable characters */
    public C5481e f31208e;

    /* renamed from: eؚۚۦ, reason: contains not printable characters */
    public boolean f31209e;

    /* renamed from: eًؕ۟, reason: contains not printable characters */
    public int f31210e;

    /* renamed from: eًؚْ, reason: contains not printable characters */
    public C6230e f31211e;

    /* renamed from: eُِٔ, reason: contains not printable characters */
    public String f31212e;

    /* renamed from: eؘِْ, reason: contains not printable characters */
    public long f31213e;

    /* renamed from: eِۢٔ, reason: contains not printable characters */
    public final HashMap f31214e;

    /* renamed from: eُِۤ, reason: contains not printable characters */
    public C7350e f31215e;

    /* renamed from: eؚؚْ, reason: contains not printable characters */
    public C10695e f31216e;

    /* renamed from: eَٔٞ, reason: contains not printable characters */
    public String f31217e;

    /* renamed from: eٔۜۙ, reason: contains not printable characters */
    public final boolean f31218e;

    /* renamed from: eَٖؑ, reason: contains not printable characters */
    public C1652e f31219e;

    /* renamed from: eٖٕٚ, reason: contains not printable characters */
    public VKProfile f31220e;

    /* renamed from: eّٖٗ, reason: contains not printable characters */
    public AudioPlaylist f31221e;

    /* renamed from: eًٜ٘, reason: contains not printable characters */
    public C8837e f31222e;

    public /* synthetic */ C15820e(int i, int i2, long j, String str) {
        this(i, j, (i2 & 4) != 0 ? null : str, false);
    }

    public C15820e(int i, long j, String str, boolean z) {
        this.f31206e = i;
        this.f31213e = j;
        this.f31212e = str;
        this.f31209e = z;
        this.f31214e = new HashMap();
        this.f31207e = 60;
        this.f31218e = true;
    }

    public C15820e(AudioPlaylist audioPlaylist) {
        this(audioPlaylist.isPro, 8, audioPlaylist.applovin, audioPlaylist.f36509implements);
    }

    /* renamed from: switch, reason: not valid java name */
    public static final void m4026switch(C15820e c15820e, Function1 function1) {
        if (!c15820e.f8237e) {
            function1.invoke(c15820e.m4027throws());
            return;
        }
        C5257e c5257e = C5257e.f11327e;
        Activity pro = c15820e.pro();
        AudioPlaylist audioPlaylist = c15820e.f31221e;
        C2046e c2046e = new C2046e(16, function1);
        c5257e.getClass();
        AbstractC16519e.ad(c5257e, pro, false, new C2122e(audioPlaylist, c2046e, (InterfaceC5083e) null, 5));
    }

    @Override // defpackage.AbstractC10716e
    /* renamed from: abstract */
    public final boolean mo1920abstract() {
        return this.f31218e;
    }

    @Override // defpackage.AbstractC10716e
    /* renamed from: catch */
    public final void mo573catch() {
        AbstractC18491e abstractC18491e = this.f21116e;
        if (abstractC18491e == null) {
            abstractC18491e = null;
        }
        C17256e c17256e = (C17256e) abstractC18491e;
        c17256e.Signature(new C16668e(this, 0));
        c17256e.loadAd();
    }

    /* JADX WARN: Type inference failed for: r1v27, types: [androidx.recyclerview.widget.startapp, eَۨٔ] */
    @Override // defpackage.AbstractC9870e
    /* renamed from: else */
    public final Object mo1405else(List list, InterfaceC5083e interfaceC5083e) {
        HashMap hashMap;
        int size = list.size();
        int i = this.f31207e;
        this.f8237e = size == i || list.size() == i - 1;
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AudioTrack audioTrack = (AudioTrack) it.next();
            Integer num = audioTrack.pro;
            if (hashMap2.containsKey(new Integer(num != null ? num.intValue() : 0))) {
                ((List) hashMap2.get(new Integer(num != null ? num.intValue() : 0))).add(audioTrack);
            } else {
                hashMap2.put(new Integer(num != null ? num.intValue() : 0), AbstractC6874e.mopub(audioTrack));
            }
        }
        Iterator it2 = hashMap2.entrySet().iterator();
        while (true) {
            boolean hasNext = it2.hasNext();
            hashMap = this.f31214e;
            if (!hasNext) {
                break;
            }
            Map.Entry entry = (Map.Entry) it2.next();
            if (hashMap.containsKey(entry.getKey())) {
                C11268e c11268e = (C11268e) hashMap.get(entry.getKey());
                C1169e license = AbstractC6874e.license();
                license.addAll(c11268e.f11959e.purchase);
                license.addAll((Collection) entry.getValue());
                c11268e.firebase(AbstractC6874e.metrica(license));
            } else {
                Object key = entry.getKey();
                C11268e c11268e2 = new C11268e(false, false, this.f31221e.adcel(), this.f31205e, new C2899e(4, this), null, 99);
                c11268e2.firebase((List) entry.getValue());
                hashMap.put(key, c11268e2);
                hashMap3.put(entry.getKey(), hashMap.get(entry.getKey()));
            }
        }
        int i2 = this.f31210e;
        C6607e c6607e = C7705e.ad;
        if (i2 == 0) {
            Iterator it3 = m2742synchronized().premium().iterator();
            while (it3.hasNext()) {
                m2742synchronized().subs((startapp) it3.next());
            }
            this.f31211e = new C6230e(this);
            this.f31208e = new C5481e(this);
            this.f31219e = new C1652e(this);
            int i3 = 8;
            this.f31215e = new C7350e(i3);
            this.f31216e = new startapp();
            this.f31222e = new C8837e(this);
            C17199e m2742synchronized = m2742synchronized();
            m2742synchronized.ads(this.f31211e);
            m2742synchronized.ads(new C1552e(this.f31219e));
            m2742synchronized.ads(this.f31208e);
            AudioPlaylist audioPlaylist = this.f31221e;
            String str = audioPlaylist != null ? audioPlaylist.crashlytics : null;
            if (str != null && str.length() != 0) {
                m2742synchronized.ads(this.f31215e);
                this.f31215e.firebase(Collections.singletonList(new Catalog2Text("_synth_playlist", 0, this.f31221e.crashlytics)));
            }
            AudioPlaylist audioPlaylist2 = this.f31221e;
            if ((audioPlaylist2 != null ? audioPlaylist2.f36515package : null) != null) {
                C7350e c7350e = new C7350e(i3);
                c7350e.firebase(Collections.singletonList(new Catalog2Text("_synth_playlist_block", 0, "Данный альбом временно недоступен или заблокирован.\n\nСкорее всего, правообладатель или артист изъяли его из библиотеки сервиса VK.\n\nУчтите, что VK X никак не относится к данной ошибке и никак не может повлиять, в отличии от блокировки треков по региону.")));
                m2742synchronized.ads(c7350e);
            }
            for (Map.Entry entry2 : hashMap.entrySet()) {
                if (((Number) entry2.getKey()).intValue() != 0) {
                    if (((Number) entry2.getKey()).intValue() > 1) {
                        m2742synchronized.ads(new startapp());
                    }
                    m2742synchronized.ads(new C5755e(c6607e, new Catalog2Layout.CompactHeader(pro().getString(R.string.part, entry2.getKey())), null));
                }
                m2742synchronized.ads((startapp) entry2.getValue());
            }
            m2742synchronized.ads(this.f8237e ? this.f31216e : this.f31222e);
            AbstractC18491e abstractC18491e = this.f21116e;
            if (abstractC18491e == null) {
                abstractC18491e = null;
            }
            abstractC18491e.advert(this.f31221e.subs);
        } else {
            if (!this.f8237e) {
                m2742synchronized().subs((startapp) AbstractC13480e.m3570break(m2742synchronized().premium()));
            }
            for (Map.Entry entry3 : hashMap3.entrySet()) {
                if (((Number) entry3.getKey()).intValue() != 0) {
                    if (((Number) entry3.getKey()).intValue() > 1) {
                        m2742synchronized().ads(new startapp());
                    }
                    m2742synchronized().ads(new C5755e(c6607e, new Catalog2Layout.CompactHeader(pro().getString(R.string.part, entry3.getKey())), null));
                }
                m2742synchronized().ads((startapp) entry3.getValue());
            }
            if (!this.f8237e) {
                m2742synchronized().ads(this.f31222e);
            }
        }
        if (this.f31209e) {
            this.f31209e = false;
            C16482e c16482e = this.f31205e;
            if (c16482e != null) {
                AbstractC13201e.metrica((AppActivity) pro(), c16482e, new C0086e(null, 0L, null, true, true, false, 103));
            }
        }
        this.f31210e = list.size() + this.f31210e;
        if (m4027throws().size() != this.f31221e.firebase) {
            this.f8237e = true;
        }
        C16251e c16251e = C16251e.ad;
        AbstractC18491e abstractC18491e2 = this.f21116e;
        if (abstractC18491e2 == null) {
            abstractC18491e2 = null;
        }
        AppCompatImageView appCompatImageView = ((C17256e) abstractC18491e2).mopub;
        c16251e.ad(appCompatImageView != null ? appCompatImageView : null, EnumC14893e.f29515e);
        return Unit.INSTANCE;
    }

    @Override // defpackage.AbstractC3655e
    /* renamed from: final */
    public final startapp mo1386final() {
        return new C17199e(new C13875e(false, 0), new startapp[0]);
    }

    @Override // defpackage.AbstractC13859e
    public final void isVip() {
        InterfaceC5083e interfaceC5083e = null;
        C8544e c8544e = new C8544e(this, interfaceC5083e, 0);
        C5981e c5981e = AbstractC15448e.ad;
        C4013e c4013e = AbstractC15448e.vip;
        C11318e c11318e = new C11318e(new C6751e(c4013e, 11), new C7195e(c8544e, interfaceC5083e, 15), 3);
        C4891e c4891e = this.f27449e;
        EnumC7785e enumC7785e = EnumC7785e.f15779e;
        AbstractC7535e.Signature(AbstractC14114e.appmetrica(c11318e, c4891e, enumC7785e), AbstractC4608e.metrica(c4891e));
        AbstractC7535e.Signature(AbstractC14114e.appmetrica(new C11318e(new C6751e(c4013e, 12), new C7195e(new C8544e(this, interfaceC5083e, 1), interfaceC5083e, 17), 3), c4891e, enumC7785e), AbstractC4608e.metrica(c4891e));
    }

    @Override // defpackage.AbstractC3655e
    /* renamed from: new */
    public final void mo1389new() {
        this.f31210e = 0;
        this.f31214e.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.AbstractC9870e
    /* renamed from: return */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo215return(int r10, defpackage.InterfaceC5083e r11) {
        /*
            r9 = this;
            boolean r10 = r11 instanceof defpackage.C1676e
            if (r10 == 0) goto L13
            r10 = r11
            eًؓؔ r10 = (defpackage.C1676e) r10
            int r0 = r10.f4610e
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r10.f4610e = r0
            goto L1a
        L13:
            eًؓؔ r10 = new eًؓؔ
            eُؑ۠ r11 = (defpackage.AbstractC10731e) r11
            r10.<init>(r9, r11)
        L1a:
            java.lang.Object r11 = r10.f4609e
            int r0 = r10.f4610e
            r1 = 1
            if (r0 == 0) goto L2f
            if (r0 != r1) goto L27
            defpackage.AbstractC2003e.purchase(r11)
            goto L4c
        L27:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L2f:
            defpackage.AbstractC2003e.purchase(r11)
            int r3 = r9.f31206e
            long r6 = r9.f31213e
            java.lang.String r8 = r9.f31212e
            int r4 = r9.f31210e
            eْؕؖ r2 = new eْؕؖ
            int r5 = r9.f31207e
            r2.<init>(r3, r4, r5, r6, r8)
            r10.f4610e = r1
            java.lang.Object r11 = defpackage.AbstractC18406e.yandex(r2, r10)
            eٟؔۙ r10 = defpackage.EnumC2821e.f6782e
            if (r11 != r10) goto L4c
            return r10
        L4c:
            ua.itaysonlab.vkapi2.methods.audio.playlist.AudioGetPlaylist$PlaylistResponse r11 = (ua.itaysonlab.vkapi2.methods.audio.playlist.AudioGetPlaylist$PlaylistResponse) r11
            int r10 = r9.f31210e
            if (r10 != 0) goto Lc8
            ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist r10 = r11.vip
            r9.f31221e = r10
            ua.itaysonlab.vkapi2.objects.users.VKProfile r0 = r11.ad
            r9.f31220e = r0
            java.util.List r10 = r10.f36507final
            int r10 = r10.size()
            r0 = 0
            if (r10 <= r1) goto L79
            ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist r10 = r9.f31221e
            java.util.List r1 = r10.f36507final
            eٟٗۙ r5 = new eٟٗۙ
            r10 = 26
            r5.<init>(r10)
            r6 = 30
            java.lang.String r2 = ", "
            r3 = 0
            r4 = 0
            java.lang.String r10 = defpackage.AbstractC13480e.m3608try(r1, r2, r3, r4, r5, r6)
            goto Lb5
        L79:
            ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist r10 = r9.f31221e
            boolean r10 = defpackage.AbstractC13406e.amazon(r10)
            if (r10 == 0) goto L8a
            ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist r10 = r9.f31221e
            ua.itaysonlab.vkapi2.objects.music.playlist.metadata.MainArtist r10 = defpackage.AbstractC13406e.billing(r10)
            java.lang.String r10 = r10.metrica
            goto Lb5
        L8a:
            ua.itaysonlab.vkapi2.objects.users.VKProfile r10 = r9.f31220e
            if (r10 == 0) goto La7
            long r1 = r10.ad
            eٖٓٗ r10 = defpackage.C14027e.ad
            r10.getClass()
            long r3 = defpackage.C14027e.metrica()
            int r10 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r10 != 0) goto La7
            ua.itaysonlab.vkx.VKXApplication$Companion r10 = ua.itaysonlab.vkx.VKXApplication.f36531e
            r10 = 2131887352(0x7f1204f8, float:1.9409309E38)
            java.lang.String r10 = ua.itaysonlab.vkx.VKXApplication.Companion.vip(r10)
            goto Lb5
        La7:
            ua.itaysonlab.vkapi2.objects.users.VKProfile r10 = r9.f31220e
            if (r10 == 0) goto Lb0
            java.lang.String r10 = r10.ad()
            goto Lb1
        Lb0:
            r10 = r0
        Lb1:
            if (r10 != 0) goto Lb5
            java.lang.String r10 = ""
        Lb5:
            r9.f31204e = r10
            ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist r10 = r9.f31221e
            if (r10 == 0) goto Lc6
            eٖۚ٘ r0 = new eٖۚ٘
            java.lang.String r1 = defpackage.AbstractC13406e.pro(r10)
            java.lang.String r10 = r10.subs
            r0.<init>(r1, r10)
        Lc6:
            r9.f31205e = r0
        Lc8:
            java.util.List r10 = r11.metrica
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C15820e.mo215return(int, eًؗۖ):java.lang.Object");
    }

    @Override // defpackage.AbstractC3655e
    /* renamed from: super */
    public final int mo861super() {
        return this.f31207e;
    }

    /* renamed from: throws, reason: not valid java name */
    public final ArrayList m4027throws() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f31214e.values().iterator();
        while (it.hasNext()) {
            arrayList.addAll(((C11268e) it.next()).f11959e.purchase);
        }
        return arrayList;
    }

    @Override // defpackage.AbstractC3655e, defpackage.AbstractC10716e
    /* renamed from: try */
    public final AbstractC18491e mo216try() {
        return new C1423e(this, 36);
    }
}
