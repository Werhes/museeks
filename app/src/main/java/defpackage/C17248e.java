package defpackage;

import android.os.Build;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.TextWatcher;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗۚٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17248e implements TextWatcher, SpanWatcher {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final AtomicInteger f33784e = new AtomicInteger(0);

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Object f33785e;

    public C17248e(Object obj) {
        this.f33785e = obj;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        ((TextWatcher) this.f33785e).afterTextChanged(editable);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        ((TextWatcher) this.f33785e).beforeTextChanged(charSequence, i, i2, i3);
    }

    @Override // android.text.SpanWatcher
    public final void onSpanAdded(Spannable spannable, Object obj, int i, int i2) {
        if (this.f33784e.get() <= 0 || !(obj instanceof C2205e)) {
            ((SpanWatcher) this.f33785e).onSpanAdded(spannable, obj, i, i2);
        }
    }

    @Override // android.text.SpanWatcher
    public final void onSpanChanged(Spannable spannable, Object obj, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        if (this.f33784e.get() <= 0 || !(obj instanceof C2205e)) {
            if (Build.VERSION.SDK_INT < 28) {
                if (i > i2) {
                    i = 0;
                }
                if (i3 > i4) {
                    i5 = i;
                    i6 = 0;
                    ((SpanWatcher) this.f33785e).onSpanChanged(spannable, obj, i5, i2, i6, i4);
                }
            }
            i5 = i;
            i6 = i3;
            ((SpanWatcher) this.f33785e).onSpanChanged(spannable, obj, i5, i2, i6, i4);
        }
    }

    @Override // android.text.SpanWatcher
    public final void onSpanRemoved(Spannable spannable, Object obj, int i, int i2) {
        if (this.f33784e.get() <= 0 || !(obj instanceof C2205e)) {
            ((SpanWatcher) this.f33785e).onSpanRemoved(spannable, obj, i, i2);
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        ((TextWatcher) this.f33785e).onTextChanged(charSequence, i, i2, i3);
    }
}
