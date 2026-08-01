package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.material.button.MaterialButton;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.activity.AppActivity;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؘؙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5481e extends AbstractC5781e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ C15820e f11761e;

    public C5481e(C15820e c15820e) {
        this.f11761e = c15820e;
    }

    @Override // defpackage.AbstractC5781e
    public final void crashlytics(InterfaceC10283e interfaceC10283e) {
        C10978e c10978e = (C10978e) interfaceC10283e;
        MaterialButton materialButton = c10978e.f21734e;
        AbstractC17680e.amazon(materialButton);
        materialButton.setOnClickListener(new ViewOnClickListenerC0123e(12, this.f11761e));
        final int i = 0;
        c10978e.f21733e.setOnClickListener(new View.OnClickListener(this) { // from class: eْٗؕ

            /* renamed from: eؘٙؓ, reason: contains not printable characters */
            public final /* synthetic */ C5481e f32856e;

            {
                this.f32856e = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i) {
                    case 0:
                        this.f32856e.firebase(false);
                        return;
                    default:
                        this.f32856e.firebase(true);
                        return;
                }
            }
        });
        final int i2 = 1;
        c10978e.f21732e.setOnClickListener(new View.OnClickListener(this) { // from class: eْٗؕ

            /* renamed from: eؘٙؓ, reason: contains not printable characters */
            public final /* synthetic */ C5481e f32856e;

            {
                this.f32856e = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i2) {
                    case 0:
                        this.f32856e.firebase(false);
                        return;
                    default:
                        this.f32856e.firebase(true);
                        return;
                }
            }
        });
        C16251e.ad.ad(materialButton, EnumC14893e.f29516e);
    }

    public final void firebase(boolean z) {
        C15820e c15820e = this.f11761e;
        C16482e c16482e = c15820e.f31205e;
        if (c16482e != null) {
            AbstractC13201e.metrica((AppActivity) c15820e.pro(), c16482e, new C0086e(null, 0L, null, false, true, z, 79));
        }
    }

    @Override // defpackage.AbstractC17112e
    public final InterfaceC10283e premium(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.v7_playlist_header_hero_buttons, viewGroup, false);
        int i = R.id.hero_play;
        MaterialButton materialButton = (MaterialButton) AbstractC7779e.vip(inflate, R.id.hero_play);
        if (materialButton != null) {
            i = R.id.hero_shuffle;
            MaterialButton materialButton2 = (MaterialButton) AbstractC7779e.vip(inflate, R.id.hero_shuffle);
            if (materialButton2 != null) {
                i = R.id.hero_snippets;
                MaterialButton materialButton3 = (MaterialButton) AbstractC7779e.vip(inflate, R.id.hero_snippets);
                if (materialButton3 != null) {
                    return new C10978e((LinearLayout) inflate, materialButton, materialButton2, materialButton3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    @Override // defpackage.AbstractC17112e
    public final int subs() {
        return R.layout.v7_playlist_header_hero_buttons;
    }
}
