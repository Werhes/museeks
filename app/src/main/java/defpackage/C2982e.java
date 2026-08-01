package defpackage;

import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Locale;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔۥً, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2982e extends BaseAdapter {

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final int f7018e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final int f7019e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f7020e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Calendar f7021e;

    static {
        f7018e = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    public C2982e() {
        Calendar metrica = AbstractC12206e.metrica(null);
        this.f7021e = metrica;
        this.f7020e = metrica.getMaximum(7);
        this.f7019e = metrica.getFirstDayOfWeek();
    }

    public C2982e(int i) {
        Calendar metrica = AbstractC12206e.metrica(null);
        this.f7021e = metrica;
        this.f7020e = metrica.getMaximum(7);
        this.f7019e = i;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f7020e;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        int i2 = this.f7020e;
        if (i >= i2) {
            return null;
        }
        int i3 = i + this.f7019e;
        if (i3 > i2) {
            i3 -= i2;
        }
        return Integer.valueOf(i3);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day_of_week, viewGroup, false);
        }
        int i2 = i + this.f7019e;
        int i3 = this.f7020e;
        if (i2 > i3) {
            i2 -= i3;
        }
        Calendar calendar = this.f7021e;
        calendar.set(7, i2);
        textView.setText(calendar.getDisplayName(7, f7018e, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(R.string.mtrl_picker_day_of_week_column_header), calendar.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }
}
