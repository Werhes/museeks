package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.loadAd;
import androidx.recyclerview.widget.startapp;
import java.util.Locale;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَِِ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11647e extends startapp {

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final C1421e f23401e;

    public C11647e(C1421e c1421e) {
        this.f23401e = c1421e;
    }

    @Override // androidx.recyclerview.widget.startapp
    public final int billing() {
        return this.f23401e.f4254e.f17470e;
    }

    @Override // androidx.recyclerview.widget.startapp
    public final void remoteconfig(loadAd loadad, int i) {
        C1421e c1421e = this.f23401e;
        int i2 = c1421e.f4254e.f17468e.f32963e + i;
        TextView textView = ((C15341e) loadad).signatures;
        textView.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i2)));
        Context context = textView.getContext();
        textView.setContentDescription(AbstractC12206e.vip().get(1) == i2 ? String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i2)) : String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i2)));
        C13391e c13391e = c1421e.f4252e;
        if (AbstractC12206e.vip().get(1) == i2) {
            Object obj = c13391e.f26644e;
        } else {
            Object obj2 = c13391e.f26645e;
        }
        throw null;
    }

    @Override // androidx.recyclerview.widget.startapp
    public final loadAd signatures(ViewGroup viewGroup, int i) {
        return new C15341e((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false));
    }
}
