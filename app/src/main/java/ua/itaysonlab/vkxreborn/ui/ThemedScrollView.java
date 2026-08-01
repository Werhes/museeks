package com.werhes.museeksreborn.ui;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ScrollView;
import androidx.annotation.Keep;
import defpackage.AbstractC15933e;
import defpackage.AbstractC1619e;
import defpackage.InterfaceC12807e;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Lua/itaysonlab/vkxreborn/ui/ThemedScrollView;", "Landroid/widget/ScrollView;", "Leُّۡ;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", BuildConfig.FLAVOR, "setTheme", "()V", "refreshTheme", "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ThemedScrollView extends ScrollView implements InterfaceC12807e {
    public static final int $stable = 8;

    /* JADX WARN: Multi-variable type inference failed */
    public ThemedScrollView(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
    }

    public ThemedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setTheme();
    }

    public /* synthetic */ ThemedScrollView(Context context, AttributeSet attributeSet, int i, AbstractC1619e abstractC1619e) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    private final void setTheme() {
        setEdgeEffectColor(AbstractC15933e.ad(R.attr.colorAccent));
    }

    @Override // defpackage.InterfaceC12807e
    public void refreshTheme() {
        setTheme();
    }
}
