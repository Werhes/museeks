package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Calendar;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚۡؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7512e extends BaseAdapter {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C8649e f15322e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public C13391e f15323e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C16831e f15324e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final int f15321e = AbstractC12206e.metrica(null).getMaximum(4);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final int f15320e = (AbstractC12206e.metrica(null).getMaximum(7) + AbstractC12206e.metrica(null).getMaximum(5)) - 1;

    public C7512e(C16831e c16831e, C8649e c8649e) {
        this.f15324e = c16831e;
        this.f15322e = c8649e;
        throw null;
    }

    public final int ad() {
        int i = this.f15322e.f17464e;
        C16831e c16831e = this.f15324e;
        Calendar calendar = c16831e.f32966e;
        int i2 = calendar.get(7);
        if (i <= 0) {
            i = calendar.getFirstDayOfWeek();
        }
        int i3 = i2 - i;
        return i3 < 0 ? i3 + c16831e.f32965e : i3;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return f15320e;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i / this.f15324e.f32965e;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        if (this.f15323e == null) {
            this.f15323e = new C13391e(context, 10);
        }
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day, viewGroup, false);
        }
        int ad = i - ad();
        if (ad >= 0) {
            C16831e c16831e = this.f15324e;
            if (ad < c16831e.f32962e) {
                textView.setTag(c16831e);
                textView.setText(String.format(textView.getResources().getConfiguration().locale, "%d", Integer.valueOf(ad + 1)));
                textView.setVisibility(0);
                textView.setEnabled(true);
                if (getItem(i) == null || textView == null) {
                    return textView;
                }
                textView.getContext();
                AbstractC12206e.vip().getTimeInMillis();
                throw null;
            }
        }
        textView.setVisibility(8);
        textView.setEnabled(false);
        if (getItem(i) == null) {
            textView.getContext();
            AbstractC12206e.vip().getTimeInMillis();
            throw null;
        }
        return textView;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }

    public final int metrica() {
        return (ad() + this.f15324e.f32962e) - 1;
    }

    @Override // android.widget.Adapter
    /* renamed from: vip, reason: merged with bridge method [inline-methods] */
    public final Long getItem(int i) {
        if (i < ad() || i > metrica()) {
            return null;
        }
        int ad = (i - ad()) + 1;
        Calendar ad2 = AbstractC12206e.ad(this.f15324e.f32966e);
        ad2.set(5, ad);
        return Long.valueOf(ad2.getTimeInMillis());
    }
}
