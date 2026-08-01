package defpackage;

import android.app.Activity;
import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist;
import ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylistPermissions;
import ua.itaysonlab.vkapi2.objects.music.playlist.metadata.MainArtist;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;
import ua.itaysonlab.vkx.activity.AppActivity;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّؓۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2014e implements InterfaceC8615e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final String f5296e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final AudioPlaylist f5297e;

    public C2014e(AudioPlaylist audioPlaylist, String str) {
        this.f5297e = audioPlaylist;
        this.f5296e = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0059 -> B:10:0x005c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable ad(defpackage.C2014e r10, defpackage.AbstractC10731e r11) {
        /*
            boolean r0 = r11 instanceof defpackage.C3989e
            if (r0 == 0) goto L13
            r0 = r11
            eٌؚؖ r0 = (defpackage.C3989e) r0
            int r1 = r0.f8900e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8900e = r1
            goto L18
        L13:
            eٌؚؖ r0 = new eٌؚؖ
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.f8903e
            int r1 = r0.f8900e
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            int r1 = r0.f8899e
            java.util.ArrayList r3 = r0.f8901e
            defpackage.AbstractC2003e.purchase(r11)
            goto L5c
        L29:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L31:
            defpackage.AbstractC2003e.purchase(r11)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            r1 = 0
            r5 = r1
        L3b:
            eْؕؖ r3 = new eْؕؖ
            ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist r1 = r10.f5297e
            long r7 = r1.applovin
            int r4 = r1.isPro
            java.lang.String r9 = r1.f36509implements
            r6 = 120(0x78, float:1.68E-43)
            r3.<init>(r4, r5, r6, r7, r9)
            r0.f8901e = r11
            r0.f8899e = r5
            r0.f8900e = r2
            java.lang.Object r1 = defpackage.AbstractC18406e.yandex(r3, r0)
            eٟؔۙ r3 = defpackage.EnumC2821e.f6782e
            if (r1 != r3) goto L59
            return r3
        L59:
            r3 = r11
            r11 = r1
            r1 = r5
        L5c:
            ua.itaysonlab.vkapi2.methods.audio.playlist.AudioGetPlaylist$PlaylistResponse r11 = (ua.itaysonlab.vkapi2.methods.audio.playlist.AudioGetPlaylist$PlaylistResponse) r11
            java.util.List r11 = r11.metrica
            r3.addAll(r11)
            r4 = 120(0x78, float:1.68E-43)
            int r5 = r1 + 120
            int r11 = r11.size()
            if (r11 >= r4) goto L6e
            return r3
        L6e:
            r11 = r3
            goto L3b
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2014e.ad(eّؓۖ, eُؑ۠):java.io.Serializable");
    }

    @Override // defpackage.InterfaceC8615e
    public final void Signature(Activity activity) {
    }

    @Override // defpackage.InterfaceC8615e
    public final List adcel() {
        AudioPlaylist audioPlaylist = this.f5297e;
        if (!AbstractC13406e.amazon(audioPlaylist)) {
            if (AbstractC13406e.loadAd(audioPlaylist)) {
                return C13664e.f27089e;
            }
            return Collections.singletonList(new C3662e(R.drawable.ic_profile_28, this.f5296e, new C5046e(this, 3)));
        }
        List<MainArtist> list = audioPlaylist.f36507final;
        ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(list, 10));
        for (MainArtist mainArtist : list) {
            arrayList.add(new C3662e(R.drawable.ic_music_mic_outline_28, mainArtist.metrica, new C10989e(mainArtist, 0)));
        }
        return arrayList;
    }

    @Override // defpackage.InterfaceC8615e
    public final InterfaceC8346e amazon() {
        C2014e c2014e;
        C1169e license = AbstractC6874e.license();
        C11794e.f23667e.getClass();
        AudioPlaylist audioPlaylist = this.f5297e;
        if (C11794e.appmetrica(audioPlaylist)) {
            c2014e = this;
            c2014e.smaato(license, R.drawable.ic_download_check_outline_28, R.string.buttonbar_pl_cached, (r15 & 4) == 0, (r15 & 8) == 0, new C9369e(28));
        } else {
            c2014e = this;
            c2014e.smaato(license, R.drawable.ic_download_outline_28, R.string.buttonbar_pl_cache, (r15 & 4) == 0, (r15 & 8) == 0, new C5046e(this, 4));
        }
        c2014e.smaato(license, R.drawable.ic_share_outline_28, R.string.share, (r15 & 4) == 0, (r15 & 8) == 0, new C5046e(this, 5));
        String str = audioPlaylist.ads;
        if (!AbstractC7890e.billing(str, "ugc") && !AbstractC7890e.billing(str, "playlist")) {
            smaato(license, R.drawable.ic_radiowaves_left_and_right_outline_28, R.string.uma_radio_title, (r15 & 4) == 0, (r15 & 8) == 0, new C9369e(29));
        }
        return AbstractC8228e.metrica(AbstractC6874e.metrica(license));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.InterfaceC8615e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object appmetrica(boolean r7, defpackage.AbstractC10731e r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.C17364e
            if (r0 == 0) goto L13
            r0 = r8
            eٌۣٗ r0 = (defpackage.C17364e) r0
            int r1 = r0.f34067e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34067e = r1
            goto L18
        L13:
            eٌۣٗ r0 = new eٌۣٗ
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f34066e
            int r1 = r0.f34067e
            ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist r2 = r6.f5297e
            r3 = 1
            if (r1 == 0) goto L2f
            if (r1 != r3) goto L27
            defpackage.AbstractC2003e.purchase(r8)
            goto L52
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            defpackage.AbstractC2003e.purchase(r8)
            if (r7 == 0) goto L52
            int r7 = r2.isPro
            long r4 = r2.applovin
            r0.f34067e = r3
            eّٕٓ r8 = defpackage.AbstractC6731e.ad
            eؕۙۜ r8 = defpackage.ExecutorC3603e.f8134e
            eؓؔۖ r1 = new eؓؔۖ
            r3 = 0
            r1.<init>(r4, r7, r3)
            java.lang.Object r7 = defpackage.AbstractC5336e.advert(r8, r1, r0)
            eٟؔۙ r8 = defpackage.EnumC2821e.f6782e
            if (r7 != r8) goto L4d
            goto L4f
        L4d:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
        L4f:
            if (r7 != r8) goto L52
            return r8
        L52:
            eْؕؖ r7 = new eْؕؖ
            r8 = 2
            r7.<init>(r2, r8)
            defpackage.AbstractC18406e.appmetrica(r7)
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2014e.appmetrica(boolean, eُؑ۠):java.lang.Object");
    }

    public final void billing(C1169e c1169e, int i, int i2, Function1 function1) {
        c1169e.add(new C1490e(i, i2, false, function1));
    }

    @Override // defpackage.InterfaceC8615e
    public final C14623e inmobi() {
        AudioPlaylist audioPlaylist = this.f5297e;
        return new C14623e(audioPlaylist, audioPlaylist.subs, this.f5296e, false);
    }

    public final void license(Context context, Function1 function1) {
        AbstractC16519e.vip((AppActivity) context, new C16373e(function1, this, null, 3));
    }

    @Override // defpackage.InterfaceC8615e
    public final InterfaceC1133e loadAd() {
        AudioPlaylist audioPlaylist = this.f5297e;
        String str = audioPlaylist.ads;
        if (AbstractC7890e.billing(str, "ugc") || AbstractC7890e.billing(str, "playlist")) {
            return null;
        }
        return new C6325e(27, audioPlaylist);
    }

    @Override // defpackage.InterfaceC8615e
    public final Integer metrica() {
        if (AbstractC13406e.loadAd(this.f5297e)) {
            return Integer.valueOf(R.drawable.ic_delete_outline_android_28);
        }
        return null;
    }

    @Override // defpackage.InterfaceC8615e
    public final Object pro(C14358e c14358e) {
        AudioPlaylist audioPlaylist = this.f5297e;
        int i = audioPlaylist.isPro;
        long j = audioPlaylist.applovin;
        C15420e c15420e = AbstractC6731e.ad;
        Object advert = AbstractC5336e.advert(ExecutorC3603e.f8134e, new C1571e(j, i, null), c14358e);
        EnumC2821e enumC2821e = EnumC2821e.f6782e;
        if (advert != enumC2821e) {
            advert = Unit.INSTANCE;
        }
        return advert == enumC2821e ? advert : Unit.INSTANCE;
    }

    @Override // defpackage.InterfaceC8615e
    public final InterfaceC8346e purchase() {
        C1169e license = AbstractC6874e.license();
        billing(license, R.drawable.ic_list_play_outline_28, R.string.action_audio_playnext, new C5046e(this, 6));
        billing(license, R.drawable.ic_list_add_outline_28, R.string.merge_playlist, new C5046e(this, 7));
        AudioPlaylist audioPlaylist = this.f5297e;
        AudioPlaylistPermissions audioPlaylistPermissions = audioPlaylist.f36525transient;
        if (audioPlaylistPermissions != null && audioPlaylistPermissions.license) {
            billing(license, R.drawable.ic_edit_outline_28, R.string.edit_playlist, new C5046e(this, 8));
        }
        AudioPlaylistPermissions audioPlaylistPermissions2 = audioPlaylist.f36525transient;
        if (audioPlaylistPermissions2 != null && audioPlaylistPermissions2.ad) {
            billing(license, R.drawable.ic_copy_outline_28, R.string.action_copy_playlist, new C5046e(this, 9));
        }
        if (AbstractC13406e.loadAd(audioPlaylist)) {
            license.add(new C1490e(R.drawable.ic_search_outline_28, R.string.find_duplicates, true, new C5046e(this, 0)));
        }
        license.add(new C1490e(R.drawable.ic_arrow_pop_up_outline_28, R.string.libtools_merge_playlist, true, new C5046e(this, 1)));
        billing(license, R.drawable.ic_download_cloud_outline_28, R.string.action_audio_dl, new C5046e(this, 2));
        return AbstractC8228e.license(AbstractC6874e.metrica(license));
    }

    @Override // defpackage.InterfaceC8615e
    public final void remoteconfig(C3566e c3566e) {
        AudioPlaylist audioPlaylist = this.f5297e;
        if (AbstractC13406e.Signature(audioPlaylist)) {
            c3566e.m1377this(EnumC10826e.f21458e);
            return;
        }
        AppActivity appActivity = (AppActivity) c3566e.f10582e;
        VKXApplication.Companion companion = VKXApplication.f36531e;
        C9402e.ad(appActivity, new C15076e(Integer.valueOf(R.drawable.ic_list_add_outline_28), VKXApplication.Companion.vip(R.string.sn_playlist_added_to_library), audioPlaylist.subs, new C6571e(VKXApplication.Companion.vip(R.string.sn_undo), new C8462e(3)), new C2899e(1, this), 80));
        c3566e.purchase();
    }

    @Override // defpackage.InterfaceC8615e
    public final Object signatures(C12972e c12972e) {
        C11794e.f23667e.getClass();
        C15420e c15420e = AbstractC6731e.ad;
        return AbstractC5336e.advert(ExecutorC3603e.f8134e, new C2454e(this.f5297e, null), c12972e);
    }

    @Override // defpackage.InterfaceC8615e
    public final void smaato(C1169e c1169e, int i, int i2, boolean z, boolean z2, Function1 function1) {
        c1169e.add(new C1637e(i, i2, z, z2, function1));
    }

    @Override // defpackage.InterfaceC8615e
    public final boolean subscription() {
        AudioPlaylist audioPlaylist = this.f5297e;
        return AbstractC13406e.amazon(audioPlaylist) || !AbstractC13406e.loadAd(audioPlaylist);
    }

    @Override // defpackage.InterfaceC8615e
    public final boolean vip() {
        return AbstractC13406e.Signature(this.f5297e);
    }
}
