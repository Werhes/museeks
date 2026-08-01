package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.text.DecimalFormat;
import org.conscrypt.BuildConfig;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٝۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8837e extends AbstractC5781e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ C15820e f17741e;

    public C8837e(C15820e c15820e) {
        this.f17741e = c15820e;
    }

    @Override // defpackage.AbstractC5781e
    public final void crashlytics(InterfaceC10283e interfaceC10283e) {
        int i;
        String firebase;
        Long l;
        TextView textView = ((C4643e) interfaceC10283e).f9974e;
        C15820e c15820e = this.f17741e;
        String str = c15820e.f31217e;
        if (str != null && str.length() != 0) {
            textView.setText(c15820e.f31217e);
            return;
        }
        long j = 0;
        while (c15820e.m4027throws().iterator().hasNext()) {
            j += ((AudioTrack) r3.next()).appmetrica;
        }
        Resources resources = textView.getResources();
        Context context = textView.getContext();
        AudioPlaylist audioPlaylist = c15820e.f31221e;
        String metrica = AbstractC13510e.metrica(context, audioPlaylist != null ? audioPlaylist.f36508goto : 0L);
        Context context2 = textView.getContext();
        AudioPlaylist audioPlaylist2 = c15820e.f31221e;
        String string = resources.getString(R.string.playlist_alt_footer, metrica, AbstractC13510e.metrica(context2, (audioPlaylist2 == null || (l = audioPlaylist2.f36523this) == null) ? 0L : l.longValue()));
        if (j > 0) {
            Resources resources2 = textView.getResources();
            String firebase2 = AbstractC15920e.firebase(textView.getResources(), R.plurals.tracks, c15820e.m4027throws().size());
            Resources resources3 = textView.getResources();
            long j2 = EnumC14332e.f28352e.f28355e;
            int i2 = (int) (j / j2);
            if (i2 > 0) {
                i = 0;
                int i3 = (int) ((j - (i2 * j2)) / EnumC14332e.f28353e.f28355e);
                firebase = AbstractC15920e.firebase(resources3, R.plurals.music_hours, i2);
                if (i3 > 0) {
                    firebase = firebase + ' ' + AbstractC15920e.firebase(resources3, R.plurals.music_minutes, i3);
                }
            } else {
                i = 0;
                int i4 = (int) (j / EnumC14332e.f28353e.f28355e);
                firebase = i4 > 0 ? AbstractC15920e.firebase(resources3, R.plurals.music_minutes, i4) : BuildConfig.FLAVOR;
            }
            VKXApplication vKXApplication = VKXApplication.f36528e;
            if (vKXApplication == null) {
                vKXApplication = null;
            }
            DecimalFormat decimalFormat = C5575e.ad;
            AudioPlaylist audioPlaylist3 = c15820e.f31221e;
            Object[] objArr = new Object[1];
            objArr[i] = C5575e.vip(audioPlaylist3 != null ? audioPlaylist3.f36512interface : i);
            String string2 = vKXApplication.getString(R.string.play_count, objArr);
            Object[] objArr2 = new Object[3];
            objArr2[i] = firebase2;
            objArr2[1] = firebase;
            objArr2[2] = string2;
            string = AbstractC4653e.isPro(resources2.getString(R.string.separator_strings_triple_ln, objArr2), "\n\n", string);
        }
        c15820e.f31217e = string;
        textView.setText(string);
    }

    @Override // defpackage.AbstractC17112e
    public final InterfaceC10283e premium(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.playlist_footer, viewGroup, false);
        if (inflate != null) {
            return new C4643e((TextView) inflate);
        }
        throw new NullPointerException("rootView");
    }

    @Override // defpackage.AbstractC17112e
    public final int subs() {
        return R.layout.playlist_footer;
    }
}
